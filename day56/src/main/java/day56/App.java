package day56;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory mf = Persistence.createEntityManagerFactory("day56");
		EntityManager em = mf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Dept dept=Dept.builder()
					.dname("test")
					.loc("test")
					.build();
		em.persist(dept);
//		Dept result = em.find(Dept.class, 1);
//		System.out.println(result);
		TypedQuery<Dept> q = em.createQuery("select d from Dept d", Dept.class);
		System.out.println(q.getResultList());
		tx.commit();
		em.close();
		mf.close();
	}

}
