package a;

import org.springframework.stereotype.Component;

@Component
class Product {

	int cost;
	String productName;

	Product() {
		// TODO Auto-generated constructor stub
	}

	Product(int cost, String productName) {
		super();
		this.cost = cost;
		this.productName = productName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [cost=" + cost + ", productName=" + productName + "]";
	}

}
