package util.defaultInfrastructure;

import lombok.AllArgsConstructor;
import model.infrastructureLayer.*;

import java.util.Set;

/**
 * @author MarcosDias
 */
@AllArgsConstructor
public class DefaultInfrastructureProject {
    private static Infrastructure infra = new Infrastructure();

    public static Infrastructure create() {
        infra.setLanguage(createDefaultLanguage());
        infra.setBasePackage("br.edu.sr.ifes.leds.sincap.controleInterno");
        infra.setDbFramework(createDefaultDatabaseFramework());
        infra.setLanguageFramework(createDefaultLanguageFramework());
        return infra;
    }

    private static LanguageFramework createDefaultLanguageFramework() {
        LanguageFramework framework = new LanguageFramework();
        framework.setName("Spring Roo");
        framework.setVersion("1.0");
        return framework;
    }

    private static DatabaseFramework createDefaultDatabaseFramework() {
        DatabaseFramework db = new DatabaseFramework();
        db.setName("HIBERNATE");
        db.setVersion("1.0");
        return db;
    }

    private static Language createDefaultLanguage() {
        Language lang = new Language();
        lang.setName("Java");
        lang.setVersion("8");
        return lang;
    }
}
