package model.applicationLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class ApplicationStructure {
    private String name;
    private LinkedHashSet<SpecificApplication> specificApplications;
}
