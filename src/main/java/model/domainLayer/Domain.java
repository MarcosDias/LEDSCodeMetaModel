package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Domain {
    private String name;
    private Set<Module> modules;
}
