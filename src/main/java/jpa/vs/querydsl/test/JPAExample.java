package jpa.vs.querydsl.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jpa.vs.querydsl.test.jpa.entity.Member;

public class JPAExample {
	private EntityManagerFactory emf;
	private EntityManager em;

	/**
	 * Initialize entity manager.
	 */
	public JPAExample() {
		emf = Persistence.createEntityManagerFactory("test");
		em = emf.createEntityManager();
	}

	public List<Member> testRead() {
		// em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Member> criteria = cb.createQuery(Member.class);
		Root<Member> member = criteria.from(Member.class);
		List<Member> resultList = em.createQuery(criteria).getResultList();
		// em.getTransaction().commit();
		return resultList;
	}

	/**
	 * Close entity manager.
	 */
	public void close() {
		em.close();
		emf.close();
	}
}
