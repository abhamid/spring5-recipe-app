package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"recipe"})
@Entity
public class Notes extends BaseEntity {

	@OneToOne
	private Recipe recipe;
	
	@Lob
	private String recipeNotes;
}
