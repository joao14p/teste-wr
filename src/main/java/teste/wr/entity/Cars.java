package teste.wr.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Cars  {
	
	@Id
	private Long id;
	
	@Column(name="factory_id")
    private Long factory_id;
	
	@Column(name="model")
	private String model;
	
	@Column(name="year")
	private Long year;
	
	@Column(name="fuel")
	private String fuel;
	
	@Column(name="doors")
	private int doors;
	
	@Column(name="cost")
	private Double cost;
	
	@Column(name="color")
	private String color;
	
	
	
	public Cars() {
	}


	public Cars(Long id, Long factory_id, String model, Long year, String fuel, int doors, Double cost, String color) {
		super();
		this.id = id;
		this.factory_id = factory_id;
		this.model = model;
		this.year = year;
		this.fuel = fuel;
		this.doors = doors;
		this.cost = cost;
		this.color = color;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Long getYear() {
		return year;
	}


	public void setYear(Long year) {
		this.year = year;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}


	public Double getCost() {
		return cost;
	}


	public void setCost(Double cost) {
		this.cost = cost;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

	public Long getFactory_id() {
		return factory_id;
	}


	public void setFactory_id(Long factory_id) {
		this.factory_id = factory_id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, cost, doors, fuel, id, model, year);
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		return Objects.equals(color, other.color) && Objects.equals(cost, other.cost) && doors == other.doors
				&& Objects.equals(fuel, other.fuel) && Objects.equals(id, other.id)
				&& Objects.equals(model, other.model) && Objects.equals(year, other.year);
	}
	
	
	
	

}
