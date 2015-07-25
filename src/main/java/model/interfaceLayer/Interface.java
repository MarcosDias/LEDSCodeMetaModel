package model.interfaceLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Interface {
    private String name;
    private LinkedHashSet<InterfaceApplication> interfaceApplication;
}
