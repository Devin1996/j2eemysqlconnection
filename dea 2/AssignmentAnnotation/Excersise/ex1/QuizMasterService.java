package ex1;

public class QuizMasterService {
	
	private QuizMaster quiz;
	
	public QuizMasterService(QuizMaster q) {
		quiz = q;
	}
	
	public String askQuestion()
	{
		return quiz.popQuestion();
	}

	public void setQuiz(QuizMaster q) {
		quiz = q;
	}
	
}
