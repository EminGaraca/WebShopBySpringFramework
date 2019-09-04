
package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Products {
    
    int products_id;
    String name;
    double price;
    int quantity;

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products{" + "products_id=" + products_id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
    public void insertProducts() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (name != null && !(name.isEmpty())) {
                Statement st =  conn.createStatement();
                st.execute("insert into products (name, price, quantity) values ('" + name + "', '" + price + "', '" + quantity + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
     public void deleteProducts() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (products_id != 0 ) {
                Statement st =  conn.createStatement();
                st.execute("delete from products where product_id= ('" + products_id + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
     
     public void updateProducts() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (products_id != 0 ) {
                Statement st =  conn.createStatement();
                st.execute("update products set name = ('" + name + "'), set price = ('" + price + "'), set quantity = ('" + quantity + "') where customer_id= ('" + products_id + "')");
            }

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
    
}
