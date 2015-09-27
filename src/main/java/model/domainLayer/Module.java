package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.interfaces.FullNamePath;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Module implements FullNamePath{
    private String name;
    private Domain parent;
    private LinkedHashSet<Service> services;
    private LinkedHashSet<ClassEnum> enums;
    private LinkedHashSet<Entity> entities;
    
    
	public String fullNamePath() {
		return parent.getName() + "." + this.name;
	}
}
