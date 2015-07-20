package model.infrastructureLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class DataBase {
    private String version;
    private String name;
    private String user;
    private String pass;
    private String host;
    private Environment environment;
}
