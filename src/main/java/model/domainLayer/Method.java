package model.domainLayer;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Method {
	private Repository parent;
    private String name;
    private ReturnType returnMethod;
    private List<Parameter> parameters;
}
