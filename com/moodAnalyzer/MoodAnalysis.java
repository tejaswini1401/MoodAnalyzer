package com.moodAnalyzer;

public class MoodAnalysis {

    private String message; 

    public MoodAnalysis(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Invalid Mood");
        }
    }

}
