package model.applicationLayer;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Application {
    private String name;
    private List<SpecificApplicationDomain> structure;
}
