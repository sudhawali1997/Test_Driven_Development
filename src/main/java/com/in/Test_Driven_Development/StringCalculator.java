package com.in.Test_Driven_Development;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}
		String[] numArray=numbers.split("[,\n]");
		int sum=0;
		for (String num : numArray) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}
		//return Integer.parseInt(numbers);
	}


