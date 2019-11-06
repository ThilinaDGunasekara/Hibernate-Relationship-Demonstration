package lk.ijse.dep.hibernate;

import com.sun.org.apache.xpath.internal.operations.Or;
import lk.ijse.dep.hibernate.entity.Customer;
import lk.ijse.dep.hibernate.entity.Employee;
import lk.ijse.dep.hibernate.entity.Order;
import lk.ijse.dep.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.Date;

public class OneToMany {

    public static void main(String[] args) {
        try(SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            /*session.save(new Order("O001",Date.valueOf("2019-10-31"),session.get(Customer.class,"C001")));
            session.save(new Order("O002",Date.valueOf("2019-11-01"),session.get(Customer.class,"C002")));
            session.save(new Order("O003",Date.valueOf("2019-11-01"),session.get(Customer.class,"C003")));*/

            /*session.save(new Order("O004",Date.valueOf("2019-11-01"),session.get(Customer.class,"C001")));*/
            /*Customer customer = session.get(Customer.class, "C001");
            customer.getOrders().forEach(System.out::println);*/

            Customer pvila = session.get(Customer.class, "C003");
            Customer alisa = session.get(Customer.class, "C001");
            //Order o003 = session.get(Order.class, "O003");
            alisa.getOrders().get(1).setCustomer(pvila);

            session.getTransaction().commit();
        }
    }
}
