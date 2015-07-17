package test;

import static ctrl.ConvertToYamlController.convert;
import static test.util.SimpleFabricProject.createSimpleProject;
import model.mainLayer.Project;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author MarcosDias
 */
public class ConvertToYamlControllerTest{
    Project proj;

    @Before
    public void setUp(){
        proj = createSimpleProject();
    }

    @Test
    public void testConvertToYamlProject(){
        String yaml = convert(proj);
        assertNotNull(yaml);
        assertFalse(yaml.isEmpty());
    }
}
