package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.moodAnalyzer.MoodAnalyserOne;

class TestMoodAnalyzer {

    @Test
    void testSadMood() {
        MoodAnalyserOne obj = new MoodAnalyserOne("I am in sad mood");
        String result = obj.analyzeMood();
        assertEquals("Sad", result); 
    }
    
    @Test
    void testHappyMood() {
        MoodAnalyserOne obj = new MoodAnalyserOne("I am in Happy mood");
        String response = obj.analyzeMood();
        assertEquals("Happy", response);
    }
    
    @Test 
    void moodNullTest() {
        MoodAnalyserOne obj = new MoodAnalyserOne(null);
        assertThrows(IllegalArgumentException.class, obj::analyzeMood);
    }
}
