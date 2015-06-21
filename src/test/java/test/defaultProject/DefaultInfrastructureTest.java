package test.defaultProject;

import junit.framework.TestCase;
import model.infrastructureLayer.Infrastructure;
import util.defaultInfrastructure.DefaultInfrastructureProject;

/**
 * @author MarcosDias
 */
public class DefaultInfrastructureTest extends TestCase{
    Infrastructure infra;

    public void setUp(){
        infra = DefaultInfrastructureProject.create();
    }

    public void testLanguage(){
        assertEquals(infra.getLanguage().getName(), "Java");
    }

    public void testBasePackage(){
        assertEquals(infra.getBasePackage(), "br.edu.sr.ifes.leds.sincap.controleInterno");
    }

    public void testDBFramework(){
        assertEquals(infra.getDbFramework().getName(), "HIBERNATE");
    }

    public void testLanguageFramework(){
        assertEquals(infra.getLanguageFramework().getName(), "Spring Roo");
    }
}
