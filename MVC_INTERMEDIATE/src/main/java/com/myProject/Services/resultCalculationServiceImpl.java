package com.myProject.Services;

import org.springframework.stereotype.Service;

@Service
public class resultCalculationServiceImpl implements resultCalculationService {

	public String resultCalculate(String userName, String crushName) {
	    // Step 1: Convert both names to lowercase and remove spaces
	    userName = userName.toLowerCase().replaceAll(" ", "");
	    crushName = crushName.toLowerCase().replaceAll(" ", "");

	    // Step 2: Calculate common letters in both names
	    int commonLetterCount = countCommonLetters(userName, crushName);

	    // Step 3: Map the remaining number to the FLAMES results
	    return calculateFLAMESResult(commonLetterCount);
	}

	// Method to count common letters between two names
	private int countCommonLetters(String name1, String name2) {
	    int count = 0;
	    for (char c : name1.toCharArray()) {
	        if (name2.indexOf(c) != -1) {
	            count++;
	            // Remove the character from the second name to avoid double counting
	            name2 = name2.replaceFirst(String.valueOf(c), "");
	        }
	    }
	    return count;
	}

	// Method to calculate FLAMES result based on the number
	private String calculateFLAMESResult(int count) {
	    // FLAMES sequence
	    String flames = "FLAMES";
	    
	    // Number of remaining letters
	    int remainingLetters = count;
	    
	    // Step 4: Eliminate letters from FLAMES based on the count
	    while (flames.length() > 1) {
	        // Find the index to remove
	        int indexToRemove = (remainingLetters % flames.length()) - 1;
	        
	        if (indexToRemove < 0) {
	            indexToRemove = flames.length() - 1;
	        }
	        
	        // Remove the character at indexToRemove
	        flames = flames.substring(0, indexToRemove) + flames.substring(indexToRemove + 1);
	        
	        // Decrement the remaining number
	        remainingLetters--;
	    }

	    // Step 5: Map the result to the corresponding relationship
	    switch (flames.charAt(0)) {
	        case 'F': return "Friends";
	        case 'L': return "Lovers";
	        case 'A': return "Affectionate";
	        case 'M': return "Marriage";
	        case 'E': return "Enemies";
	        case 'S': return "Siblings";
	        default: return "Unknown";
	    }
	}

}
