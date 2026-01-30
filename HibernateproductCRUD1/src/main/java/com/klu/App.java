package com.klu; 
import java.util.List; 
import org.hibernate.Session; 
import org.hibernate.Transaction; 
import org.hibernate.query.Query; 
public class App { 
public static void main(String[] args) { 
/* ===================================================== 
STEP 1: INSERT 5–8 PRODUCT RECORDS (RUN ONLY ONCE)  */ 
Session session = HibernateUtil.getSessionFactory().openSession(); 
Transaction tx = session.beginTransaction(); 
session.save(new Product("Laptop", "Electronics", 75000, 10)); 
session.save(new Product("Mouse", "Electronics", 800, 50)); 
session.save(new Product("Keyboard", "Electronics", 2500, 30)); 
session.save(new Product("Chair", "Furniture", 4500, 20)); 
session.save(new Product("Table", "Furniture", 9000, 5)); 
session.save(new Product("Pen", "Stationery", 20, 200)); 
session.save(new Product("Notebook", "Stationery", 80, 150)); 
tx.commit(); 
session.close(); 
System.out.println("Products Inserted Successfully");
}
}