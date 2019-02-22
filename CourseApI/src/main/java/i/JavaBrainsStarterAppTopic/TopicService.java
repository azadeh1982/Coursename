package i.JavaBrainsStarterAppTopic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service // If other class needs to have a certain questions about this application they will inject //
public class TopicService {
	private List<Topic> topics= Arrays.asList(
			new Topic("Java ee", "Java", "Core Java"),
			new Topic("Math", "Physic", "Biology"),
			new Topic("spanish","English","French")
			);
	public List<Topic> getAllTopics(){
		return topics;
		
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
}
////Very important Command for Filtering /////
