package test.defaultProject;

import junit.framework.TestCase;
import model.mainLayer.Project;

/**
 * @author MarcosDias
 */
public class DefaultProjectTest extends TestCase{
    Project project;

    public void setUp(){
        project = D.create();
    }
}
