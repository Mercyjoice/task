package a;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemp")
class Regular_Employee extends Employee {
	@Column(name = "salary")
	private float salary;
	@Column(name = "bonus")
	private int bonus;

	Regular_Employee() {
		// TODO Auto-generated constructor stub
	}

	Regular_Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	Regular_Employee(float salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
