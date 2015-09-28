package model.domainLayer;

import java.util.List;

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
    private List<Method> methods;
}
