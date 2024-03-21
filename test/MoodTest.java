package Mood_Analyser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodTest {

	@Test
	void test1() {
		MoodAnalyzer ma = new MoodAnalyzer("I am in a Sad Mood");
		String mood = ma.analyseMood();
		Assertions.assertEquals("Sad", mood);
	}
	
	@Test
	void test2() {
		MoodAnalyzer ma = new MoodAnalyzer("I am in Any mood");
		String mood = ma.analyseMood();
		Assertions.assertEquals("Happy", mood);
	}

}
