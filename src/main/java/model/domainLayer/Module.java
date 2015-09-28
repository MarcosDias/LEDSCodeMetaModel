package model.domainLayer;

import java.util.List;

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
    private List<Service> services;
    private List<ClassEnum> enums;
    private List<Entity> entities;
    
    
	public String fullNamePath() {
		return parent.getName() + "." + this.name;
	}
}
