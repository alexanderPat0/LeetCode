package lc_17_09_2024;

import java.util.ArrayList;

class Solution {
    public String[] mergeArraysUsingStreams(String[] arr1, String[] arr2) {
		
		String[] mergedArray = new String[arr1.length + arr2.length];
		
		for(int i = 0 ; i < arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}
		
		for(int i = 0 ; i < arr2.length; i++) {
			mergedArray[arr1.length + i] = arr2[i];
		}
		
		return mergedArray;
    }
	
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");
        String[] array3 = mergeArraysUsingStreams(array1, array2);
        
        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<String> bannedWords = new ArrayList<>();
        
        for(String a : array3) {
        	if(!wordList.contains(a) && !bannedWords.contains(a)) {
        		wordList.add(a);
        	}else {
        		wordList.remove(a);
                bannedWords.add(a);
        	}
        }
        
        String[] finalArray = wordList.toArray(new String[0]);

		return finalArray;
  
    }
}
