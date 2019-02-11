package io.pivotal.fe.rhardt.taskpoc;

import lombok.extern.java.Log;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@Log
@EnableTask
@SpringBootApplication
public class TaskPocApplication {


	@Bean
	ApplicationRunner run() {
		return args -> log.info("running at " + Instant.now().toString());
	}


	public static void main(String[] args) {
		SpringApplication.run(TaskPocApplication.class, args);
	}

}

