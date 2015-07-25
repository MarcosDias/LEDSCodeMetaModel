package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
@NoArgsConstructor
public class Entity extends SuperClass{
    private boolean abstrato;
    private Repository repository;
    private LinkedHashSet<Entity> classExtends;
    private AccessModifier accessModifier;
    private LinkedHashSet<Attribute> attributes;
}
