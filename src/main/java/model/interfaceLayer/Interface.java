package model.interfaceLayer;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Interface {
    private String name;
    private List<InterfaceApplication> interfaceApplication;
}
