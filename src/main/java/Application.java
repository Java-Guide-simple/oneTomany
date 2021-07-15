import java.util.ArrayList;
import java.util.List;

import in.stack.oneToMany.DAO.QuestionDAO;
import in.stack.oneToMany.model.Answer;
import in.stack.oneToMany.model.Question;

public class Application {
	
	public static void main(String[] args) {
		
		Answer ans1 = new Answer("ans1","Ram");
		Answer ans2 = new Answer("ans2","Shyam");
		Answer ans3 = new Answer("ans3","Sita");
		
		List<Answer> list= new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		Question ques = new Question("Ques.A",list);
		
		QuestionDAO dao = new QuestionDAO();
		dao.saveQuestion(ques);
		
	}

}
