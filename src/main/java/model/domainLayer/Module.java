package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Module {
    private String name;
    private Set<Service> services;
    private Set<ClassEnum> enums;
    private Set<Entity> entities;
}
