package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	Date moment;
	OrderStatus status;
	List<OrderItem> items = new ArrayList<>();
	Client client;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	public Order () {}


	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public List<OrderItem> getItems() {
		// for item in items
		return items;
	}
	
	public void addItem (OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem (OrderItem item) {
		this.items.remove(item);
	}
	
	
	public Client getClient() {
		return client;
	}


	public double total() {
		
		double sum = 0.0;
		for (OrderItem item : this.items) {
			
			sum += item.subTotal();
			
		}
		return sum;
		
	}
	
	public String toString () {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdf.format(this.getMoment()) + "\n");
		sb.append("Order statud: " + status + "\n");
		sb.append("Client: " + this.getClient().toString() + "\n");
		sb.append("Order Items:\n");
		for (OrderItem item : this.getItems()) {
			
			sb.append(item.toString() + "\n");
		}
		
		sb.append("Total order: $ " + this.total());
		
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
}
