package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Service {
    private String name;
    private Module parent;
    private LinkedHashSet<ServiceMethod> methods;
}
