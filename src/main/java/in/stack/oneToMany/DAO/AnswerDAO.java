package in.stack.oneToMany.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.stack.oneToMany.model.Answer;
import in.stack.oneToMany.util.HibernateUtil;

public class AnswerDAO {
	public class AccountDao {

		public void saveAccount(Answer ans) {
			Transaction trans = null;

			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				trans = session.beginTransaction();
				session.save(ans);
				trans.commit();

			} catch (Exception e) {

				if (trans != null) {
					trans.rollback();
				}
				e.printStackTrace();
			}

		}

		public void updateEmployee(Answer ans) {
			Transaction trans = null;

			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				trans = session.beginTransaction();
				session.update(ans);
				trans.commit();

			} catch (Exception e) {

				if (trans != null) {
					trans.rollback();
				}
				e.printStackTrace();
			}

		}
	}
}