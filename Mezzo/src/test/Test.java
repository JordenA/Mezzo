package test;

import algorithm.Algorithm;
import algorithm.alphaAlgo;

public class Test {
	boolean printInfo = true;
	public void testering() {
		Algorithm alg = new alphaAlgo();
		alg.createFirstPool();
	}
	
	String st = new String("Array ( [total] => 1135922 [limit] => 1 [offset] => 0 [results] => Array ( [0] => Array ( [uid] => A36BC7B0-A514-4B0F-9295-5EEBDEE42977 [nickname] => Beyoncé [moods] => Array ( [0] => Array ( [uid] => 86712840-0F9C-3AA0-74C5-DFBA82E879D1 [name] => aesthetic [importance] => 10 ) [1] => Array ( [uid] => 6D5AE713-FA4A-2067-6CC8-B296D29EF57B [name] => sensibility [importance] => 33 ) [2] => Array ( [uid] => ");
	public String run() {
		if(printInfo) {
			System.out.println("the string is now " + st);
		}
		alphaAlgo alg = new alphaAlgo();
		String toReturn = alg.getDataFromInput(st);
		System.out.println("the string we we got from method is " + toReturn);
		return toReturn;
		
	}

}
