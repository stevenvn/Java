
public class QuizTime {

	public static void main(String[] args) {
		Question q1 = new Question ("What is the capital of Vietnam","Hanoi",7);
		Question q2 = new Question ("What is the largest city of Vietnam","Saigon",8);
		Question q3 = new Question ("what is the main nation in Vietnam", "kinh",3);
		Question q4 = new Question ("How many river does Vietnam has", "108", 9);
		Question q5 = new Question ("What is the color of sky","blue",2);
		Question q6 = new Question ("How long does it take to finish Computer Study Program in Langara","2",4);
		Question q7 = new Question ("How many credit of CPSC 1181 are","3",2);
		Question q8 = new Question ("What is the second main language in Canada","France",4);
		Question q9 = new Question ("What is a legal age in Vancouver","19",5);
		Question q10 = new Question ("Does library open on weekend","yes",2);

		Quizz quizz1 = new Quizz (5);
		quizz1.add(q1);
		quizz1.add(q2);
		quizz1.add(q3);
		quizz1.add(q4);
		quizz1.add(q5);
		Quizz quizz2 = new Quizz (10);
		quizz2.add(q1);
		quizz2.add(q2);
		quizz2.add(q3);
		quizz2.add(q4);
		quizz2.add(q5);
		quizz2.add(q6);
		quizz2.add(q7);
		quizz2.add(q8);
		quizz2.add(q9);
		quizz2.add(q10);
		System.out.println("You have " + Quizz.numberOfObject + " quizzes to do");
		quizz1.giveQuizz();
		quizz2.giveQuizz(7,9);

	}

}
