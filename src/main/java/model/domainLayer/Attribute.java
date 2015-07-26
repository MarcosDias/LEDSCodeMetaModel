package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Attribute extends SuperAttribute {
    private AccessModifier accessModifier;
    private String name;
}
