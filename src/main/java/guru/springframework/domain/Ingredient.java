package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"recipe"})
@Entity
public class Ingredient extends BaseEntity {

	private String description;
	private BigDecimal amount;
	
	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure uom;
	
	@ManyToOne
	private Recipe recipe;

	public Ingredient() {
		super();
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
		this.recipe = recipe;
	}
}
