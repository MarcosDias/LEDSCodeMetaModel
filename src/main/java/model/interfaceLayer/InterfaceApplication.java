package model.interfaceLayer;

import lombok.Getter;
import lombok.Setter;
import model.applicationLayer.Application;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class InterfaceApplication {
    private String name;
    private Type type;
    private Application application;
}
