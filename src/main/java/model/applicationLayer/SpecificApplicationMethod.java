package model.applicationLayer;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.ServiceMethod;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class SpecificApplicationMethod extends SpecificApplication {
    private ServiceMethod serviceMethod;
}
