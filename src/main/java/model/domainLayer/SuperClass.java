package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public abstract class SuperClass extends Classifier{
	protected String name;
	protected Module parent;
}
