package ctrl;

import model.mainLayer.Project;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author MarcosDias
 */
public class ConvertToFileController {

    /**
     * Converte um Projeto de Software em uma representacao textual salva em um arquivo
     * @param project Projeto de Software que sera convertido
     * @param path Caminho do arquivo que sera salvo
     * @throws FileNotFoundException
     */
    public static void export(Project project, String path) throws FileNotFoundException {
        Yaml.dump(project, new File(path));
    }

    /**
     * Dado um arquivo com a representacao textual de um Projeto de Software,
     * ele sera convertido novamente para um objeto do tipo Project.
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    public static Project importFile(String path) throws FileNotFoundException {
        return Yaml.loadType(new File(path), Project.class);
    }
}
