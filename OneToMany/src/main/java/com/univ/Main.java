package com.univ;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println("Prog Start.........");
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //create employe
        Employe e1 = new Employe();
        e1.setEid(208);
        e1.setEmploye("Ram");
        
        Employe e2 = new Employe();
        e2.setEid(209);
        e2.setEmploye("Rakesh");
        
        //create department
        Department dept1 = new Department();
        dept1.setDid(111);
        dept1.setDepartment("production");
        
        Department dept3 = new Department();
        dept3.setDid(113);
        dept3.setDepartment("Human Resources");
        
        Department dept2 = new Department();
        dept2.setDid(112);
        dept2.setDepartment("Admin");
        
        //setting department with employe
        dept1.setEmp(e1);
        dept1.setEmp(e2);
        dept2.setEmp(e1);
        dept2.setEmp(e2);
        dept3.setEmp(e2);
        
        //creating object of list
        List<Department> dlist = new ArrayList<Department>();
        dlist.add(dept1);
        dlist.add(dept2);
        dlist.add(dept3);
        
        e1.setDept(dlist);
        e2.setDept(dlist);
        
        //session object
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        //save data
        s.save(e1);
        s.save(e2);
        s.save(dept1);
        s.save(dept2);
        s.save(dept3);
        
        tx.commit();
        s.close();
        factory.close();
        System.out.println("Prog end........");
    }
}
