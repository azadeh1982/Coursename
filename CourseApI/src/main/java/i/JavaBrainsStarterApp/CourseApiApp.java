package i.JavaBrainsStarterApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "i.JavaBrainsStarterApp.hello,i.JavaBrainsStarterAppTopic",})//**Most important thing is you have to add your all controller's package to @ComponentScan annotation //
public class CourseApiApp {
	public static void main(String[] args) {
	SpringApplication.run(CourseApiApp.class, args);
		
	}
}
