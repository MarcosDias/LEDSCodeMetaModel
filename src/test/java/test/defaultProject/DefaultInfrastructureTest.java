package test.defaultProject;

import model.infrastructureLayer.Infrastructure;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.defaultInfrastructure.DefaultInfrastructureProject;

/**
 * @author MarcosDias
 */
public class DefaultInfrastructureTest {
    Infrastructure infra;

    @Before
    public void setUp(){
        infra = DefaultInfrastructureProject.create();
    }

    @Test
    public void testLanguage(){
        Assert.assertEquals(infra.getLanguage().toString(), "Java");
    }
}
