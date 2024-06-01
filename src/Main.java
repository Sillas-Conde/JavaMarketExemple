import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		// Iniciar o Cliente
		// Iniciar os produtos "disponíveis"
		//Iniciar o pedido
		
		Date birthDate;
		String clientName = "Alex Green";
		String clientEmail = "ag@gmail.com";
		
		System.out.println(clientName);
		System.out.println(clientEmail);
		
		Scanner scan = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter BirthDate:");
		birthDate = sdf.parse(scan.nextLine());
		System.out.println(birthDate);
		Client client = new Client(clientName, clientEmail, birthDate);
		
		scan.close();
		
		
		Order order = new Order(new Date(), OrderStatus.valueOf("PROCESSING"),client);
		
		// Create product TV and assign it to the order
		Product tv = new Product("TV", 1000.0);		
		OrderItem order1 = new OrderItem(10,tv.getPrice());
		order1.setProduct(tv);
		order.addItem(order1);
		
		// Create product Mouse and assign it to the order
		Product mouse = new Product("Mouse", 40.0);		
		OrderItem order2 = new OrderItem(10,mouse.getPrice());
		order2.setProduct(mouse);
		order.addItem(order2);
		
		
		System.out.println("ORDER SUMMARY");
		//System.out.println(client.toString());
		
		System.out.println(order.toString());
		
		
	}

}
