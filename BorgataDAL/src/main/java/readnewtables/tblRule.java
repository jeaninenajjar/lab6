package readnewtables;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import domain.RuleDomainModel;
import java.util.ArrayList;
import org.hibernate.Transaction;
import java.util.List;
import util.HibernateUtil;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RuleDomainModel;
import util.HibernateUtil;

public class tblRule {

	
	
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
	
	

		public static ArrayList<RuleDomainModel> getRules() {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = null;
			ArrayList<RuleDomainModel> Rules = new ArrayList<RuleDomainModel>();

			try {
				tx = session.beginTransaction();

				List rules = session.createQuery("FROM RuleDomainModel").list();
				for (Iterator iterator = rules.iterator(); iterator.hasNext();) {
					RuleDomainModel rle = (RuleDomainModel) iterator.next();
					Rules.add(rle);

				}

				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
				session.close();
			}
			return Rules;

		}
	
	
}
