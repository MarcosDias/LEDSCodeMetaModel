package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class ClassEnum extends SuperClass {
    private List<String> values;
}
