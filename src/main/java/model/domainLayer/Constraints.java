package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Constraints {
	private boolean pk;
	private boolean unique;
	private boolean nullable;
	private Integer min;
	private Integer max;
}
