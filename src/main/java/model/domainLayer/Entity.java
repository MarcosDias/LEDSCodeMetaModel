package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Entity {
    private boolean abstrato;
    private Repository repository;
    private Set<Entity> classExtends;
    private AccessModifier accessModifier;
    private Set<Attribute> attributes;
}
