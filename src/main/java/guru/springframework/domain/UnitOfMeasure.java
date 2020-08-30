package guru.springframework.domain;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class UnitOfMeasure extends BaseEntity {
	private String description;

	public UnitOfMeasure(String description) {
		super();
		this.description = description;
	}
	
	
}
