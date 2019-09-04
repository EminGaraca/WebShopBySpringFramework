package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Customers {
   
    int customers_id;
    String name;

    public int getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(int customers_id) {
        this.customers_id = customers_id;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customers{" + "customers_id=" + customers_id + ", name=" + name + '}';
    }
    
    public void insertCustomer() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (name != null && !(name.isEmpty())) {
                Statement st =  conn.createStatement();
                st.execute("insert into customers (name) value ('" + name + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
     public void deleteCustomer() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (customers_id != 0 ) {
                Statement st =  conn.createStatement();
                st.execute("delete from customers where customer_id= ('" + customers_id + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
     
     public void updateCustomer() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (customers_id != 0 ) {
                Statement st =  conn.createStatement();
                st.execute("update customers set name = ('" + name + "') where customer_id= ('" + customers_id + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
}
