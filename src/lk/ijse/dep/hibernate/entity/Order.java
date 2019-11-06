package lk.ijse.dep.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "`Order`")
public class Order {

    @Id
    private
    String id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "Customer_id", referencedColumnName = "id",nullable = false)
    private
    Customer customer;

    public Order(String id, Date date, Customer customer) {
        this.id = id;
        this.date = date;
        this.setCustomer(customer);
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", customer=" + getCustomer() +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
