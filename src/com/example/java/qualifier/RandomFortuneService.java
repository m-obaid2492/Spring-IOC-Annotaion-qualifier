package com.example.java.qualifier;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class RandomFortuneService implements FortuneService {
	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck ",
			"The journery is the reward"
	};
	
	private Random  myRandom= new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index= myRandom.nextInt(data.length);
		String fortune= data[index];
		 return  fortune;
	}

}
