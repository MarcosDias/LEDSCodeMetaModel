package model.applicationLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Application {
    private String name;
    private LinkedHashSet<SpecificApplication> structure;
}
