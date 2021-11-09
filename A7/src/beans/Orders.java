package beans;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Orders {

public List<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		/*Was told to remove or comment out
		orders.add(new Order("0", "Candy Bar", (float)10.00, 0));
		orders.add(new Order("1", "Soap", (float)15.00, 1));
		orders.add(new Order("2", "Netflix Annual Subscription", (float)122.00, 2));
		orders.add(new Order("3", "iPhone 13 Mini", (float)1000.00, 3));
		orders.add(new Order("4", "1 Packet of Gum", (float)1.00, 4));
		orders.add(new Order("5", "Soup", (float)6.00, 5));
		orders.add(new Order("6", "Puzzle", (float)5.00, 6));
		orders.add(new Order("7", "Squid Game The Complete Series", (float)45.00, 7));
		orders.add(new Order("8", "The Best You, You Can Be!", (float)100.00, 8));
		orders.add(new Order("9", "Water Bottle", (float)2.00, 9));
		*/
	}

	@PostConstruct
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


}
