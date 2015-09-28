package model.domainLayer;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Domain {
    private String name;
    private List<Module> modules;
}
