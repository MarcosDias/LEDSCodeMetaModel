package test;

import ctrl.ConvertToYamlController;
import junit.framework.TestCase;
import model.mainLayer.Project;

import static ctrl.ConvertToYamlController.convert;
import static test.util.SimpleFabricProject.createSimpleProject;

/**
 * @author MarcosDias
 */
public class ConvertToYamlControllerTest extends TestCase{
    Project proj;
    ConvertToYamlController conv;

    public void setUp(){
        proj = createSimpleProject();
        conv = new ConvertToYamlController();
    }

    public void testConvertToYamlProject(){
        String yaml = convert(proj);
        assertNotNull(yaml);
        assertFalse(yaml.isEmpty());
    }
}
