package in.stack.oneToMany.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.stack.oneToMany.model.Answer;
import in.stack.oneToMany.model.Question;
import in.stack.oneToMany.util.HibernateUtil;

public class QuestionDAO {

	public void saveQuestion(Question ques) {
		Transaction trans = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			trans = session.beginTransaction();
			
			
			session.persist(ques);
			trans.commit();
			    
			   
		} catch (Exception e) {

			if (trans != null) {
			trans.rollback();
			}
			e.printStackTrace();
		}

	}

	public void updateQuestion(Question ques) {
		Transaction trans = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			trans = session.beginTransaction();
			session.update(ques);
			trans.commit();

		} catch (Exception e) {

			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}

	}

//Delete Employee

	public void deleteQuestion(int id) {
		Transaction trans = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			trans = session.beginTransaction();

			Question target = session.get(Question.class, id);
			if (target != null) {
				session.delete(target);

				System.out.println("Question Id " + id + " deleted Successfully");

			}

			trans.commit();

		} catch (Exception e) {

			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}

	}

	
	// Read Question By Id
	public Question getQuestionById(int id) {
		Transaction trans = null;
		Question target = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			trans = session.beginTransaction();

			target = session.get(Question.class, id);

		} catch (Exception e) {

			if (trans != null) {
				trans.rollback();
			}
			e.printStackTrace();
		}

		return target;
	}

}
