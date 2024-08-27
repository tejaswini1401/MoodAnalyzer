package com.moodAnalyzer;

public class MoodAnalyserOne {

    private String message;

    public MoodAnalyserOne(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyzeMood() {
        try {
            if (message == null || message.isEmpty()) {
                throw new IllegalArgumentException("Enter a valid mood");
            }
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Enter a valid mood", e);
        }
    }
}
