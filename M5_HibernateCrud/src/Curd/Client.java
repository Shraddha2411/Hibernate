package Curd;

import org.hibernate.Session;

public class Client {

	public static void main(String[] args) 
	{

		Session session=HibernateDbConnect.getSessionFactory().openSession();

  //CRUD
		//Step 1:Create
		
	
	
	  Users user=new Users("Sahana104","Saha1234","Sahana","Sa");
	  session.beginTransaction(); session.save(user);
	  session.getTransaction().commit();
	  
	 
	 
		
		//Step 2: Retrieval
		
		/*
		 * Users user1=new Users(); session.beginTransaction();
		 * user1=session.get(Users.class, 16); System.out.println(user1);
		 * session.getTransaction().commit();
		 */
		 
		
		//step 3: update
		
		/*
		 * Users user2=new Users(); session.beginTransaction();
		 * user2=session.get(Users.class, 1); user2.setLastname("H");
		 * System.out.println(user2); session.getTransaction().commit();
		 */
		
		//step 4: delete
		
		/*
		 * Users user3=new Users(); session.beginTransaction();
		 * user3=session.get(Users.class,21) ; session.delete(user3);
		 * session.getTransaction().commit();
		 */
		 
	}

}
