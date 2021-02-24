package com.company.projectClass;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DictionarySorter {
	
	public static String mode = "selection";	
	
	public static void main(String[] args) throws IOException {
		// generates the word list from the dictionary file
		BufferedReader in = new BufferedReader(new FileReader("wordsShuffled.txt"));
		List<String> words = new ArrayList<String>();
		for (String line = in.readLine(); line != null; line = in.readLine()) {
			words.add(line.trim());
		}
		in.close();
		long startTime = System.currentTimeMillis();
		if (mode.equals("selection"))
			selectionSort(words);
		else if (mode.equals("insertion"))
			selectionSort(words);
		else
			selectionSort(words);
		System.out.println("runtime: " + (System.currentTimeMillis() - startTime));
		
		BufferedWriter out = new BufferedWriter(new FileWriter("wordsSorted.txt"));
		for (String s : words)
			out.write(s + "\n");
		out.close();
	}
	
	public static void selectionSort(List<String> words) {
		for(int i=0;i<words.size();i++){
			int minIndex = i;
			for(int j=i;j<words.size();j++){
				if(words.get(minIndex).charAt(0)>words.get(j).charAt(0)){
					minIndex = j;
				}

			}
			String temporary = words.get(i);
			words.set(i, words.get(minIndex));
			words.set(minIndex, temporary);

		}
		System.out.println(words);

	}

	public static void insertionSort(List<String> words) {
		for(int i=1;i<words.size();++i){
			char key = words.get(i).charAt(0);
			int j = i-1;
			while(j>=0&&words.get(j).charAt(0)>key){
				words.set(j+1, words.get(j));
				j--;
			}
			words.set(j+1, words.get(i));

		}
		System.out.println(words);

	}

	public static void mergeSort(List<String> words) {
	
		// your code here
	}
}
