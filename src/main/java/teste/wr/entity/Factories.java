package teste.wr.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="factories")
public class Factories{

	
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="country_code")
	private Long countryCode;

	@OneToMany
	@JoinColumn(name="factory_id")
	private List<Cars> cars;
	
	public Factories () {
	}
	
	public Factories(Long id, String name, Long countryCode, List<Cars> cars) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.cars = cars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Long countryCode) {
		this.countryCode = countryCode;
	}
	

	public List<Cars> getCars() {
		return cars;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factories other = (Factories) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	

}
