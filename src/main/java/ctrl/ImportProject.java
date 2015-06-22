package ctrl;

import model.mainLayer.Project;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author MarcosDias
 */
public class ImportProject {
    /**
     * Dado um arquivo com a representacao textual de um Projeto de Software,
     * ele sera convertido novamente para um objeto do tipo Project.
     * @param path Caminho do arquivo que sera importado
     * @return
     * @throws FileNotFoundException
     */
    public static Project importFileYaml(String path) throws FileNotFoundException {
        return Yaml.loadType(new File(path), Project.class);
    }
}
