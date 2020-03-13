import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testQuestion {

	@Test
	void testingQuestion() {
		Question q1 = new Question("What is my name", "Steven", 1);
		assertEquals(q1.getQuestion(), "What is my name");
		assertEquals(q1.getAnswer(), "Steven");
		assertEquals(q1.getDifficulty(), 1);
		Question q2 = new Question ("Where am i from", "vietnam");
		assertEquals(q2.getDifficulty(),1);

	}
	
	@Test
	void testGetterAndSetter () {
		Question q3 = new Question ("",null,0);
		assertEquals(q3.getQuestion(),"No question" );
		assertEquals(q3.getAnswer(), "No answer");
		q3.setQuestion("What is capial of Vietnam");
		assertEquals(q3.getQuestion(),"What is capial of Vietnam");
		q3.setAnswer("Hanoi");
		assertEquals(q3.getAnswer(),"Hanoi");
		q3.setDifficulty(5);
		assertEquals(q3.getDifficulty(),5);
		Question q9 = new Question ("What country has highest population in the world","China");
		assertEquals(q9.getDifficulty(),1);
	}
	
	@Test
	void testToString () {
		Question q4 = new Question ("Where am i from", "Tiengiang", 10);
		assertEquals(q4.toString(),"Question is Where am i from *** Answer is Tiengiang *** Difficulty is 10 ***");
	}
	
	@Test
	void testIsCorrect () {
		Question q5 = new Question ("What is my name", "steven");
		assertEquals(q5.isCorrect("cuong"),false);
	}

}
