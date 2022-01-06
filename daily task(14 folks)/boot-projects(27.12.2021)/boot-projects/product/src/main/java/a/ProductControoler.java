package a;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductControoler {

	@Autowired
	Product p;
	List<Product> p1 = new ArrayList<>();
	static int count = 1;

	@GetMapping("/welcome")
	public String callme() {
		return "<h1>Hi Guys we will have lunch after this</h1>";
	}

	@PostMapping("/add/pname/{productname}/pprice/{price}")
	public ResponseEntity<Object> addProduct(@PathVariable String productname, @PathVariable int price) {
		p1.add(new Product(price, productname));
		System.out.println("a new product is added");
		return new ResponseEntity<>("product added ", HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public List<Product> getAllItems() {
		return p1;
	}

}
