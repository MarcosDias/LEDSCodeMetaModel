package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Domain {
    private String name;
    private LinkedHashSet<Module> modules;
}
