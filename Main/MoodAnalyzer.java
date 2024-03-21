package Mood_Analyser.Main;

public class MoodAnalyzer {
	String message;
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	public MoodAnalyzer() {
	}
	public String analyseMood() {
		try {
		if(message.toLowerCase().contains("sad")) {
			return "Sad";
		}
		else {
			return "Happy";
		}
		}
		catch(Exception e) {
			return "Happy";
		}
	}
}
