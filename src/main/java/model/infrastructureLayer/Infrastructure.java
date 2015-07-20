package model.infrastructureLayer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
@NoArgsConstructor
public class Infrastructure {
    private String basePackage;
    private String projectVersion;
    private DataBase dataBase;
    private Language language;
    private DatabaseFramework dbFramework;
    private LanguageFramework languageFramework;
}
