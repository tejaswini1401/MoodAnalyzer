package com.moodAnalyzer;

public class MoodAnalyserOne {
	
	private String message;
	
	public MoodAnalyserOne(String message) {
		this.message = message;
	}

	public String analyzeMood() {
	
		if(message.toLowerCase().contains("sad")) {
			return "Sad";
		}
		else if(message.toLowerCase().contains("happy")) {
			return "Happy";
		}
		return "";
	}
}
