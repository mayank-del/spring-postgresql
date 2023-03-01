package com.springpost.springrestpost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpost.springrestpost.dao.StudentDao;

@SpringBootApplication
public class SpringrestpostApplication implements CommandLineRunner{

	@Autowired
	private StudentDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringrestpostApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		//this.studentDao.createTable();
		this.studentDao.insertData("ishika","kolkata");
	}

}
