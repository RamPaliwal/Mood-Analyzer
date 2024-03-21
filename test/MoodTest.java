package Mood_Analyser.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Mood_Analyser.Main.MoodAnalyzer;

class MoodTest {

	@Test
	void test1() {
		MoodAnalyzer ma = new MoodAnalyzer(null);
		String mood = ma.analyseMood();
		Assertions.assertEquals("Happy", mood);
	}
	
	@Test
	void test2() {
		MoodAnalyzer ma = new MoodAnalyzer("I am in Any mood");
		String mood = ma.analyseMood();
		Assertions.assertEquals("Happy", mood);
	}

}
