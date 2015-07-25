package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Repository {
    private String name;
    private LinkedHashSet<Method> methods;
}
