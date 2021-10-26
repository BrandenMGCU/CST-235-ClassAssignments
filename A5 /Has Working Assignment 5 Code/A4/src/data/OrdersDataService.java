package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.Order;

/**
 * Session Bean implementation class OrdersDataService
 */
@Stateless
@Local(DataAccessInterface.class)
public class OrdersDataService {

    /**
     * Default constructor. 
     */
    public OrdersDataService() {
        // TODO Auto-generated constructor stub
    }
    
    /*
     * @see DataS
     */
    public List<Order> findAll() {
    	List<Order> orders = new ArrayList<>();
    	 String JdbcURL = "jdbc:mysql://127.0.0.1:8889/?user=root";  
	      String Username = "root";
	      String Password = "root";
	      Connection conn = null;
	      String sql = "SELECT * FROM testapp.Orders";
	      try {
				conn = DriverManager.getConnection(JdbcURL, Username, Password);
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery(sql);
				System.out.println("================>THE CONNECTION WORKED!");
				System.out.println("=====================>THE DATABASE IS CONNECTED!");
				
			while (res.next())
			{
				orders.add(new Order(res.getInt("ID"), res.getString("ORDER_NO"), res.getString("PRODUCT_NAME"), res.getFloat("PRICE"), res.getInt("QUANTITY")));
			}
			res.close();
				
			}
			catch(SQLException e) {
				System.out.println("======>THERE WAS AN ISSUE WHEN CONNECTING TO THE SERVER!" + e);
				e.printStackTrace();
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
	      return orders;
		}
	
    /**
     * @see DataAccessInterface#findById(int)
     * 
     */
    
    
    public Order findById(int id)
    {
    	Connection conn = null;
    	Order order = new Order();
    	 String JdbcURL = "jdbc:mysql://127.0.0.1:8889/?user=root";  
	      String Username = "root";
	      String Password = "root";
	      String sql = "SELECT * FROM testapp.Orders WHERE (ID) = id";
	      try {
				conn = DriverManager.getConnection(JdbcURL, Username, Password);
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery(sql);
				System.out.println("================>THE CONNECTION WORKED!");
				System.out.println("=====================>THE DATABASE IS CONNECTED!");
				
			while (res.next())
			{
				order = (new Order(res.getInt("ID"), res.getString("ORDER_NO"), res.getString("PRODUCT_NAME"), res.getFloat("PRICE"), res.getInt("QUANTITY")));
			}
			res.close();
				
			}
			catch(SQLException e) {
				System.out.println("======>THERE WAS AN ISSUE WHEN CONNECTING TO THE SERVER!" + e);
				e.printStackTrace();
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
	      return order;
		}

    public boolean create(Order order) {
	// TODO Auto-generated method stub
	return false;
}

    public boolean update(Order order) {
	// TODO Auto-generated method stub
	return false;
}

    public boolean delete(Order order) {
	// TODO Auto-generated method stub
	return false;
}

}


