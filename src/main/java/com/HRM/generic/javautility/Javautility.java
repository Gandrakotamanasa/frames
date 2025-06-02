package com.HRM.generic.javautility;

import java.util.Random;

public class Javautility {

	public int getrandomnumber()
	{
		Random r=new Random();
		int rnum=r.nextInt(1000);
		return rnum;
		
	}
}
