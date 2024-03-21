package Mood_Analyser;

public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	public String analyseMood() {
		if(message.toLowerCase().contains("sad")) {
			return "Sad";
		}
		else if(message.toLowerCase().contains("happy")) {
			return "Happy";
		}
		else {
			return "Happy";
		}
	}
}
