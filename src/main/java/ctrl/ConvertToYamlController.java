package ctrl;

import model.mainLayer.Project;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author MarcosDias
 */
public class ConvertToYamlController {

    /**
     * Converte um Projeto de Software em uma representacao textual yaml.
     * @param project Projeto de Software que sera convertido
     */
    public static String convert(Project project){
        return Yaml.dump(project);
    }
}
