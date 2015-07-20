package model.interfaceLayer;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Interface {
    private String name;
    private Set<InterfaceApplication> interfaceApplication;
}
