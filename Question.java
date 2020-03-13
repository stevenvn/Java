/**
 * The Question class stimulate short-answer style questions to be placed on a quiz including:
 *  Question constructor and question constructor with default difficulty is 1
 *  getQuestion,setQuestion, getAnswer,setAnswer,getDifficulty,setDifficulty,summary 
 */

/**
 * @author Steven ( Huy Cuong Do)
 */
public class Question {
	private String question,answer;
	private int difficulty;
	
	/**
	 * This constructor creates a new question
	 * @param question This is the first string parameter to question constructor
	 * @param answer This is the second integer parameter to question constructor
	 * @param difficulty This is the third integer parameter to question constructor
	 * @return No return for the constructor
	 */	

	public Question (String question, String answer, int difficulty) {
		if (question == null || question == "") {
			this.question= "No question";
		} else {
			this.question= question;
		}
		
		if (answer == null || answer == "") {
			this.answer = "No answer";
		} else {
			this.answer = answer;	

		}
		
		if (difficulty > 0 && difficulty <11) {
			this.difficulty = difficulty;
		}else {
			this.difficulty =5;
		}
	}
	
	/**
	 * This constructor creates a new question with default difficulty is 1
	 * @param question This is the first string parameter to question constructor
	 * @param answer This is the second integer parameter to question constructor
	 * @return No return for the constructor
	 */	
	public Question (String question, String answer) {
		this(question,answer, 1);
	}
	
	/**
	 * This getter returns a name of a question
	 * @param No parameter for getQuestion getter
	 * @return string This return the question name
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * This setter sets a new question
	 * @param question This is a string parameter for setQuestion setter
	 * @return No return for setQuestion setter
	 */

	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * This getter returns an answer of a question
	 * @param No parameter for getAnswer getter
	 * @return string This return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * This setter sets a new answer
	 * @param question This is a string parameter for setAnswer setter
	 * @return No return for setAnswer setter
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * This getter returns difficulty of a question
	 * @param No parameter for getDifficulty getter
	 * @return int This return the difficulty
	 */
	public int getDifficulty() {
		return difficulty;
	}
	/**
	 * This setter sets a new level of difficulty
	 * @param difficulty This is an int parameter for setDifficulty setter
	 * @return No return for setDifficulty setter
	 */
	public void setDifficulty(int difficulty) {
		if (difficulty > 0 && difficulty <11 ) {
			this.difficulty = difficulty;
		}
	}
	/**
	 * This method return summary of a Question object including what question, answer, difficulty are 
	 * @param No parameter for toString method
	 * @return String This return a string summary of a question
	 */
	public String toString () {
		String result = "";
		result+= "Question is " + this.question + " ***";
		result+= " Answer is " +  this.answer + " ***";
		result+= " Difficulty is " + this.difficulty + " ***";
		return result;
	}
	/**
	 * This method return true or false for given answer
	 * @param attemptedAnswer This is a string parameter for isCorrect method
	 * @return boolean This return true/false
	 */
	public boolean isCorrect (String attemptedAnswer) {
		String correctAnswer = this.getAnswer();
		if (correctAnswer.equals(attemptedAnswer)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {

		
		
	}

}


