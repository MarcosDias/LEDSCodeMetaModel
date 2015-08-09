package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Module {
    private String name;
    private Domain parent;
    private LinkedHashSet<Service> services;
    private LinkedHashSet<ClassEnum> enums;
    private LinkedHashSet<Entity> entities;
}
