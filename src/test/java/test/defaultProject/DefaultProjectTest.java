package test.defaultProject;

import junit.framework.TestCase;
import model.mainLayer.Project;
import util.DefaultProject;

/**
 * @author MarcosDias
 */
public class DefaultProjectTest extends TestCase{
    Project project;

    public void setUp(){
        project = DefaultProject.create();
    }

    public void testNameProjectNotNull(){
        assertNotNull(project.getName());
    }

    public void testCreatadDateNotNull(){
        assertNotNull(project.getCreated());
    }

    public void testInfraStructureNotNull(){
        assertNotNull(project.getInfrastructure());
    }

//    public void testDomainNotNull(){
//        assertNotNull(project.getDomains());
//    }
}
