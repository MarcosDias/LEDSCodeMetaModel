package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Method {
    private String name;
    private ReturnType returnMethod;
    private LinkedHashSet<Parameter> parameters;
}
