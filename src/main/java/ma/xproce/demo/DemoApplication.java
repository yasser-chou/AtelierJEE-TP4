package ma.xproce.demo;

import ma.xproce.demo.entities.Creator;
import ma.xproce.demo.entities.Video;
import ma.xproce.demo.repositories.CreatorRepository;
import ma.xproce.demo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demoData(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            // Create a Creator
            Creator creator1 = new Creator(null, "John Doe", "john.doe@example.com", null);
            creator1 = creatorRepository.save(creator1);

            Video video1 = new Video(null, "Spring Boot Tutorial", "https://example.com/springboot", "Learn Spring Boot from scratch!", new Date(), creator1);
            videoRepository.save(video1);

            


        };
    }
}
