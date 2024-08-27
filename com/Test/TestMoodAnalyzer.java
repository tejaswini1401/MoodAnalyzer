package com.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.moodAnalyzer.MoodAnalysis;
import com.moodAnalyzer.MoodAnalyserException;

class TestMoodAnalyzer {

    @Test
    void testSadMood() throws MoodAnalyserException {
        MoodAnalysis obj = new MoodAnalysis("I am in sad mood");
        String result = obj.analyzeMood();
        assertEquals("Sad", result);
    }

    @Test
    void testHappyMood() throws MoodAnalyserException {
        MoodAnalysis obj = new MoodAnalysis("I am in Happy mood");
        String response = obj.analyzeMood();
        assertEquals("Happy", response);
    }

    @Test 
	void moodNullTest(){
		
		try {
		MoodAnalysis obj = new MoodAnalysis(null);
		String res = obj.analyzeMood();
		assertEquals("HAPPY",res);	
		}catch(MoodAnalyserException e) {
			System.out.println(e.getMessage());
		
		}
	}

}
