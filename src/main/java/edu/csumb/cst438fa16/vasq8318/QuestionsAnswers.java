import java.util.HashMap;
import java.util.Random;

public class QuestionsAnswers {
	private HashMap<String, String> questionsAnswers;
	
	public QuestionsAnswers() {
		this.questionsAnswers = new HashMap<String, String>();
	}
	
	public void put(String question, String answer) {
		this.questionsAnswers.put(question, answer);
	}
	
	public boolean testAnswer(String question, String answer) {
		return this.questionsAnswers.get(question).equals(answer);
	}
	
	public String getRandomQuestion() {
		Random g = new Random();
		Object[] questions = this.questionsAnswers.keySet().toArray();
		Object randomQuestion = questions[g.nextInt(questions.length)];
	
		return randomQuestion.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world.");
	}
}
