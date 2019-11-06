package lk.ijse.dep.hibernate;

import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.entity.Employee;
import lk.ijse.dep.hibernate.entity.Spouse;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

public class OneToOne {

    public static void main(String[] args) {
        try(SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            /*Employee employee = new Employee("E001", "Thilina", "Homagama");
            Spouse spouse = new Spouse("S001", "????", "hhhh", employee);

            session.save(employee);
            session.save(spouse);*/

            Employee e001 = session.get(Employee.class, "E001");
            System.out.println(e001.getSpouse());

            session.getTransaction().commit();
        }
    }
}
