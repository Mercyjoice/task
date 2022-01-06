package a;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rohon")
class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rid")
	private int id;
	@Column(name = "rname")
	private String name;
	@Column(name = "raddress")
	private String address;

	Emp() {
		// TODO Auto-generated constructor stub
	}

	Emp(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
