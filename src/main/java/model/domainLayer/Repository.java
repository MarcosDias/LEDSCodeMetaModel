package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
@NoArgsConstructor
public class Repository {
    private String name;
    private LinkedHashSet<Method> methods;
}
