package business;

import java.util.List;


import javax.ejb.Local;
import javax.inject.Inject;

import beans.Order;

/**
 * Session Bean implementation class OrdersBusinessInterface
 */
@Local
public interface OrdersBusinessInterface 
{

    /**
     * Default constructor. 
     */
	public void test();

	public List<Order> getOrders();

	public void setOrders(List<Order> orders);

	Order getOrder(int id); 

}