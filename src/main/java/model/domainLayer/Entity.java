package model.domainLayer;

import java.util.List;

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
    private List<Entity> classExtends;
    private AccessModifier accessModifier;
    private List<Attribute> attributes;
}
