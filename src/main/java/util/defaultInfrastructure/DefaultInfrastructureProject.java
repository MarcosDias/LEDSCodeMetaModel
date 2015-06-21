package util.defaultInfrastructure;

import lombok.AllArgsConstructor;
import model.infrastructureLayer.*;

import java.util.Set;

/**
 * @author MarcosDias
 */
@AllArgsConstructor
public class DefaultInfrastructureProject {
    private static Infrastructure infra;

    public static Infrastructure create() {
        infra = new Infrastructure();
//        infra.setLanguage(createDefaultLanguage());
        infra.setBasePackage("br.edu.ifes.leds.sincap.controleInterno");
        infra.getFrameworks().add(createDefaultDatabaseFramework());
        infra.getFrameworks().add(createDefaultLanguageFramework());
        return infra;
    }

    private static Framework createDefaultLanguageFramework() {
        Framework framework = new LanguageFramework();
        framework.setName("Spring Roo");
        framework.setVersion("1.0");
        return framework;
    }

    private static Framework createDefaultDatabaseFramework() {
        Framework db = new DatabaseFramework();
        db.setName("HIBERNATE");
        db.setVersion("1.0");
        return db;
    }

//    private static Language createDefaultLanguage() {
//        Language lang = new Language();
//        lang.setName("Java");
//        lang.setVersion("8");
//        return lang;
//    }
}
