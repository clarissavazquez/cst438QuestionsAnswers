import static org.junit.Assert.*;
import org.junit.*;

public class QuestionsAnswersTest {
	@Test
	public void testQuestionMatchesAnswer() {
		QuestionsAnswers qa = new QuestionsAnswers();
		qa.put("What's my favorite color?", "black");
		assertTrue(qa.testAnswer("What's my favorite color?", "black"));
	}
}
