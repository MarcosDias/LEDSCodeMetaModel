package model.applicationLayer;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.Service;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class SpecificApplicationService extends SpecificApplication {
    private Service service;
    private SpecificApplicationMethod son;
}
