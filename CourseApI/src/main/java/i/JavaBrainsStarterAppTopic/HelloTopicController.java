package i.JavaBrainsStarterAppTopic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTopicController{
	@Autowired   ///Thats a way to do the Dependency injection
	private TopicService topicService;  // We  mentioned the topicService Class here.

	@RequestMapping("/topics")
public List<Topic>getAllTopics(){
return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")// don't forget the {}
	public Topic getTopics(@PathVariable String id) {   //Path variable is important 
		return topicService.getTopic(id);// This is setting the parameter
	}
		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody Topic topic) {
							topicService.addTopic(topic);
			}
			
		}

