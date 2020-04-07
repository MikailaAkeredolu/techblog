package com.tech552.TechBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechBlogApplication.class, args);
		System.out.println("welcome branch updated again for demo");
	}

}
/*
New feature - git branch branchName
git add .
git commit
git checkout master
git merge branchName
git push
 */