import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

public class QuestionsAnswersTest extends TestCase {
	@Test
	public void testQuestionMatchesAnswer() {
		QuestionsAnswers qa = new QuestionsAnswers();
		qa.put("What's my favorite color?", "black");
		assertTrue(qa.testAnswer("What's my favorite color?", "black"));
	}
}
