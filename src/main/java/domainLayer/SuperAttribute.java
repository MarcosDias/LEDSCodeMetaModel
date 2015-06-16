package domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public abstract class SuperAttribute {
    private String name;
    private Classifier datetype;
    private CollectionType collectionType;
}
