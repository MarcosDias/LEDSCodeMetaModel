package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Method {
    private String name;
    private Classifier returnMethod;
    private Set<Parameter> parameters;
}
