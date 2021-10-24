package business;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@Alternative
public class OrdersBusinessService implements OrdersBusinessInterface
{

	List<Order> orders = new ArrayList<Order>(); 
	   /**
     * @see OrdersBusinessInterface#test()
     */
	
	@Override
    public void test()
    {
    	System.out.println("============> Hello from OrdersBusinessService.test()");
    }

    
    /**
     * Default constructor. 
     */
    public OrdersBusinessService() 
    {
    	orders.add(new Order("000", "Test Order Business 0",(float)100, 11));
    	orders.add(new Order("001", "Test Order Business 1",(float)120, 111));
    	orders.add(new Order("002", "Test Order Business 2",(float)11, 12));
    	orders.add(new Order("003", "Test Order Business 3",(float)10, 14));
    	orders.add(new Order("004", "Test Order Business 4",(float)13, 10));	
    }
    
    @Override
    public List<Order> getOrders()
    {
    	return orders;
    }
    
    @Override
    public void setOrders(List<Order> orders)
    {
    	this.orders = orders;
    }
}
