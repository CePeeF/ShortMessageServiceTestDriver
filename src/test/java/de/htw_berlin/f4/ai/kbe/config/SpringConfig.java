package de.htw_berlin.f4.ai.kbe.config;

import de.htw_berlin.aStudent.repository.*;
import de.htw_berlin.aStudent.service.MessageService;
import de.htw_berlin.aStudent.service.TopicService;
import de.htw_berlin.aStudent.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import de.htw_berlin.f4.ai.kbe.appconfig.AppConfig;
import de.htw_berlin.f4.ai.kbe.kurznachrichten.ShortMessageService;
import de.htw_berlin.f4.ai.kbe.kurznachrichten.ShortMessageServiceImpl;

@Configuration
@Import(AppConfig.class) 
public class SpringConfig {

	@Bean
	ShortMessageService shortMessageService(){

		UserRepoInterface userRepo = new MockUserRepo();
		TopicRepoInterface topicRepo = new MockTopicRepo(userRepo);
		 MessageRepoInterface messageRepo = new MockMessageRepo(topicRepo);

		return new ShortMessageServiceImpl(userRepo,topicRepo,messageRepo);
	}
	
}
 