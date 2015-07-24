package model.domainLayer;

import java.util.Set;

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
    private Set<Entity> classExtends;
    private AccessModifier accessModifier;
    private Set<Attribute> attributes;
}
