package test.util;

import model.applicationLayer.Application;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;
import model.mainLayer.Project;

import java.util.Calendar;
import java.util.HashSet;

/**
 * @author MarcosDias
 */
public class SimpleFabricProject {
    public static Project createSimpleProject() {
        Project p = new Project();
        p.setApplications(new HashSet<Application>());
        p.setDomains(new HashSet<Domain>());
        p.setInfrastructure(new Infrastructure());
        p.setInterface(new Interface());
        p.setCreated(Calendar.getInstance());
        p.setName("SimpleProject");

        return p;
    }
}
