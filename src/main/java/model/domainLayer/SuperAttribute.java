package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public abstract class SuperAttribute {
    protected String name;
    protected Classifier datetype;
    protected CollectionType collectionType;
}
