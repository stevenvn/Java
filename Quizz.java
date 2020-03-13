/**
 * The Quiz class stimulate quiz that contains questions including:
 *  Quiz constructor
 *  add,giveQuizz, giveQuizz with  2 parameter difficulties 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Quizz {
	public  static int numberOfObject;
	private ArrayList<Question> arrQuestions;
	
	/**
	 * This constructor creates a new quiz
	 * @param number This is the  integer parameter to quiz constructor
	 * @return No return for the constructor
	 */	
	public Quizz (int number) {
		if (number > 0 && number <= 25) {
			arrQuestions = new ArrayList(number);
			numberOfObject++;
		}
	}
	/**
	 * This getter returns array list question of a quiz
	 * @param No parameter for getArrQuestions getter
	 * @return ArrayList<Question> This return the array list questions
	 */
	public ArrayList<Question> getArrQuestions () {
		if (this.arrQuestions != null) {
			ArrayList<Question> arrQuestionsTemp = new ArrayList ();
			for (int i =0; i < this.arrQuestions.size(); i++) {
				arrQuestionsTemp.add(arrQuestions.get(i));
			}
			return arrQuestionsTemp;
		}else {
			return null;
		}
	}
	
	/**
	 * This method add a question to the quizz 
	 * @param q  This is a Question parameter for add method
	 * @return No return for the add method
	 */
	public void add (Question q) {
		arrQuestions.add(q);
	}
	/**
	 * This method shows available question ons the quiz and user can answer these questions 
	 * @param No parameter for giveQuizz method
	 * @return No return for the giveQuizz method
	 */
	public void giveQuizz () {
		Scanner input = new Scanner(System.in);
		String answer;
		String questionName;
		int difficulty;
		int correctAnswer = 0;
		if (this.arrQuestions != null) {
			for (int i = 0; i < this.arrQuestions.size(); i++) {
				Question q1 = this.arrQuestions.get(i);
				questionName = q1.getQuestion();
				difficulty = q1.getDifficulty();
				System.out.println(questionName + " " + "Difficulty: " + difficulty);
				answer = input.nextLine();
				if (answer.equals(q1.getAnswer())) {
					System.out.println("Correct!");
					correctAnswer++;
				} else {
					System.out.println("Incorrect!");
				}
				
			}
			System.out.println("Your score is " + correctAnswer );
		}

	}
	/**
	 * This method shows available question given the level of difficulty ons the quiz and user can answer these questions 
	 * @param minDif This is first int parameter for giveQuizz method
	 * @param maxDif This is second int parameter for giveQuizz method
	 * @return No return for the giveQuizz method
	 */
	public void giveQuizz (int minDif, int maxDif) {
		ArrayList<Question> arrTemp = new ArrayList ();
		arrTemp.addAll(this.arrQuestions);
		this.arrQuestions.clear();
		for (int i =0; i < arrTemp.size();i++) {
			Question q1= arrTemp.get(i);
			if (q1.getDifficulty() >= minDif && q1.getDifficulty() <= maxDif) {
				this.arrQuestions.add(q1);
			}
		}
		giveQuizz();
		this.arrQuestions.addAll(arrTemp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
