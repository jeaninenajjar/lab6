package readnewtables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.CardDomainModel;
import util.HibernateUtil;

public class tblRuleCards {

	//example from ps6
		/*
		
		public static ArrayList<PersonDomainModel> getPersons() {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			PersonDomainModel perGet = null;
			ArrayList<PersonDomainModel> pers = new ArrayList<PersonDomainModel>();

			try {
				tx = session.beginTransaction();

				List persons = session.createQuery("FROM PersonDomainModel").list();
				for (Iterator iterator = persons.iterator(); iterator.hasNext();) {
					PersonDomainModel per = (PersonDomainModel) iterator.next();
					pers.add(per);

				}

				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return pers;
		}
		*/
		
		//our version::
		
		


	public static ArrayList<CardDomainModel> getRuleCards() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		ArrayList<CardDomainModel> RuleCards = new ArrayList<CardDomainModel>();

		try {
			tx = session.beginTransaction();

			List rules = session.createQuery("FROM CardDomainModel").list();
			for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
				CardDomainModel rle = (CardDomainModel) iterator.next();
				RuleCards.add(rle);

			}

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return RuleCards;
		

	}
}
