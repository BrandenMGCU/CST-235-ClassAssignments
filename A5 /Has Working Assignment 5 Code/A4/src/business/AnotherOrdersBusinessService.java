package business;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface 
{
	
	List<Order> orders = new ArrayList<Order>();
	   /**
     * @see OrdersBusinessInterface#test()
     */
	
	
	  public void test()
	    {
	    	System.out.println("===========> Hello from AnotherOrdersBusinessService.test()");
	    }
	  
	
    /**
     * Default constructor. 
     */
    public AnotherOrdersBusinessService() 
    {
    	/*
    	orders.add(new Order("A1","Another Order Number 1 Sample 1",(float)10.00,1));
    	orders.add(new Order("A2","Another Order Number 2 Sample 2",(float)20.00,4));
    	orders.add(new Order("A3","Another Order Number 3 Sample 3",(float)30.00,8));
    	orders.add(new Order("A4","Another Order Number 4 Sample 4",(float)40.00,12));
    	orders.add(new Order("A5","Another Order Number 5 Sample 5",(float)1.00,16));
    	*/
    }
    
    @Override
    public List<Order>getOrders()
    {
    	return orders;
    }
    
    @Override
    public void setOrders(List<Order> orders)
    {
    	this.orders = orders;
    }
    
    @Override
    public Order getOrder(int id)
    {
    	return null;
    }

}
