package domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Service {
    private String name;
    private Set<ServiceMethod> methods;
}
