package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.moodAnalyzer.MoodAnalyserOne;

class TestMoodAnalyzer {

    @Test
    void testSadMood() {
        MoodAnalyserOne obj = new MoodAnalyserOne();
        String result = obj.analyzeMood("I am in sad mood");
        assertEquals("SAD", result); 
    }
    
    @Test
    void testHappyMood() {
        MoodAnalyserOne obj = new MoodAnalyserOne();
        String response = obj.analyzeMood("I am in Happy mood");
        assertEquals("HAPPY", response);
    }
}
