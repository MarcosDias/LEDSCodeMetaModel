package model.domainLayer;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public abstract class SuperClass extends Classifier implements FullNamePath{
	protected String name;
	protected Module parent;
	
	public String fullNamePath() {
		return "~."+ parent.fullNamePath() + "." + this.name;
	}
}
