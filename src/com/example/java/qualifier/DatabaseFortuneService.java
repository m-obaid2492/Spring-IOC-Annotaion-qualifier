package com.example.java.qualifier;

import org.springframework.stereotype.Component;


@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today you are fucked man!";
	}

}
