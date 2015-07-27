package model.applicationLayer;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.Module;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class SpecificApplicationModule extends SpecificApplication {
    private Module module;
    private SpecificApplicationService son;
}
