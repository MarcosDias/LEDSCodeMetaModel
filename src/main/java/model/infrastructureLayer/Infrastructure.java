package model.infrastructureLayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author MarcosDias
 */
@Setter
@Getter
@NoArgsConstructor
public class Infrastructure {
    private String basePackage;
    private String projectVersion;
    private Set<DataBase> dataBases;
    private Language language;
    private DatabaseFramework dbFramework;
    private LanguageFramework languageFramework;
}
