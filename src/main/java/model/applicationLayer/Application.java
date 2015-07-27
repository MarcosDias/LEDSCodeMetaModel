package model.applicationLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Application {
    private String name;
    private SpecificApplicationDomain first;
}
