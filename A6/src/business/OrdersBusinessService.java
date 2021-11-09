package business;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
import data.OrdersDataService;

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
	@EJB
	OrdersDataService service;
	
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
    	/* was told to remove
    	orders.add(new Order("000", "Test Order Business 0",(float)100, 11));
    	orders.add(new Order("001", "Test Order Business 1",(float)120, 111));
    	orders.add(new Order("002", "Test Order Business 2",(float)11, 12));
    	orders.add(new Order("003", "Test Order Business 3",(float)10, 14));
    	orders.add(new Order("004", "Test Order Business 4",(float)13, 10));
    	orders.add(new Order("005", "Test Order Business 5",(float)1000, 19));
    	orders.add(new Order("006", "Test Order Business 6",(float)120, 87));
    	orders.add(new Order("007", "Test Order Business 7",(float)110, 122));
    	orders.add(new Order("008", "Test Order Business 8",(float)104, 144));
    	orders.add(new Order("009", "Test Order Business 9",(float)135, 160));
    	orders.add(new Order("0010", "Test Order Business 10",(float)137, 103));
   	
 */
    }
 
    @Override
    public List<Order> getOrders()
    {
    	return service.findAll();
    }
    
    @Override
    public Order getOrder(int id)
    {
    	return service.findById(id);
    }
    
    @Override
    public void setOrders(List<Order> orders)
    {
    	this.orders = orders;
    }
}
