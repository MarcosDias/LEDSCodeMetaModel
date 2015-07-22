package model.domainLayer;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Repository {
    private String name;
    private Set<ServiceMethod> methods;
}
