package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Service implements FullNamePath{
    private String name;
    private Module parent;
    private LinkedHashSet<ServiceMethod> methods;
    
    public String fullNamePath() {
		return parent.getName() + "." + this.name;
	}
}
