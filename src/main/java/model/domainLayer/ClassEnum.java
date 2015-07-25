package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class ClassEnum extends SuperClass {
    private LinkedHashSet<String> values;
}
