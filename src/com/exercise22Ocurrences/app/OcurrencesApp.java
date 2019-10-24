package com.exercise22Ocurrences.app;
import java.util.Random;
import java.util.HashMap;
public class OcurrencesApp {

	public static void main(String[] args) {
		
//Constants
		final int elements=100;
		
//variables
		//int occurrences=0;
		
//imports
		int [] array = new int[elements];
		Random numbers = new Random(System.nanoTime());
		HashMap<Integer,Integer> hash= new HashMap<Integer,Integer>();
		
//Initialization		
		for(int i=0; i<elements;i++) {
			array[i]=numbers.nextInt(5);
		}
//process
		for(int element:array) {//for each!
			/*Occurrences=0;*/
			if(hash.containsKey(element)){
				//Occurrences =hash.get(element);
				//Occurrences++;
				hash.put(element,hash.get(element)+1);
			}
			hash.putIfAbsent(element,1);
		}
		System.out.println(hash);
		}

}
