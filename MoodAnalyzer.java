package com.moodAnalyzer;

public class MoodAnalyzer {
	public static String message;

	public MoodAnalyzer(String message) throws MoodAnalyzerException {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String analyzeMood() throws MoodAnalyzerException{
		try {
			if(message.toLowerCase().contains("sad")) {
				return "Sad";
			}else {
				return "Happy";
			}
		}catch(NullPointerException e) {
			throw new MoodAnalyzerException("Enter valid mood");
			
		}
	}
}
