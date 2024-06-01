package entities;

public class OrderItem {
	
	int quantity;
	double price ;
	private Product product;	
	
	
	public OrderItem () {}
	public OrderItem (int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
	
		return this.price*this.quantity;
	}
	
	public String toString () {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getProduct().getName() + ", ");
		sb.append("$ " + String.format("%.2f",this.getPrice()) + ", ");
		sb.append("Quantity: " + this.getQuantity() + ", ");
		sb.append("Subtotal: $ " + this.subTotal());
		
		return sb.toString();
		
		
	}
	
	
	
}
