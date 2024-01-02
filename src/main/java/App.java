

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.store.app.domain.Contact;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			emf = Persistence.createEntityManagerFactory("jbd-pu");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Contact contact = new Contact();
			contact.setFirstName("John");
			contact.setLastName("Bloch");
			contact.setPhone("+1-408-575-1317");
			contact.setEmail("test@4545.com");
			entityManager.persist(contact);

			transaction.commit();

			Query q = entityManager.createQuery("select s from Contact s");

			List<Contact> resultList = q.getResultList();
			System.out.println("num of contacts:" + resultList.size());
			for (Contact next : resultList) {
				System.out.println("next contact: " + next);
			}

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			entityManager.close();
			emf.close();
		}
	}
}
