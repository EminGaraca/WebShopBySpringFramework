package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sale {
    
    int sale_id;
    int customers_id;
    int products_id;
    
    double quantity;

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(int customers_id) {
        this.customers_id = customers_id;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sale{" + "sale_id=" + sale_id + ", customers_id=" + customers_id + ", products_id=" + products_id + ", quantity=" + quantity + '}';
    }
    
    public void addSale() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop?useUnicode=true&characterEncoding=utf8&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "emin2210");) {

            if (products_id != 0 && customers_id != 0 ) {
                Statement st =  conn.createStatement();
                st.execute("insert into sale (customer_id, product_id, quantity) values ('" + customers_id + "', '" + products_id + "', '" + quantity + "')");
                st.execute(" update products set quantity=(select quantity-'" + quantity + "') where product_id='"+products_id+"' ");
            } 

        } catch (SQLException ex) {
            System.out.println("Error in database connection: \n" + ex.getMessage());
        }
    }
    
}
