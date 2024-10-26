package com.in.Test_Driven_Development;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int add(String numbers) {

		if (numbers.isEmpty()) {
			return 0;
		}
		String delimeter=",|\n";
	    if (numbers.startsWith("//")) {
	        int delimiterIndex = numbers.indexOf("\n");
	        delimeter = numbers.substring(2, delimiterIndex);
	        numbers = numbers.substring(delimiterIndex + 1);
	    }
		String[] numArray=numbers.split(delimeter);
		int sum=0;
		List<Integer> negatives = new ArrayList<>();
		
		for (String num : numArray) {
			int number = Integer.parseInt(num);
			if(number<0)
				negatives.add(number);
            sum += Integer.parseInt(num);
	       
	    }
		if (!negatives.isEmpty()) {
	        throw new IllegalArgumentException("negative numbers not allowed: " + negatives.toString().replaceAll("[\\[\\]]", ""));
	    }
	    return sum;
	
	}
		
	}


