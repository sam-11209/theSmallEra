package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitHubPracticeApplication.class, args);
		System.out.println("----git hub running-----------");
		System.out.println("----adding something from git hub -----------");
		System.out.println("ABC");
		System.out.println("ABCD");
		System.out.println("----adding something from git hub again -----------");
	}

}
