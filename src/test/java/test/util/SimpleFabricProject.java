package test.util;

import java.util.Calendar;
import java.util.LinkedHashSet;

import model.applicationLayer.Application;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;
import model.mainLayer.Project;

/**
 * @author MarcosDias
 */
public class SimpleFabricProject {
    public static Project createSimpleProject() {
        Project p = new Project();
        p.setApplications(new LinkedHashSet<Application>());
        p.setDomains(new LinkedHashSet<Domain>());
        p.setInfrastructure(new Infrastructure());
        p.setIface(new Interface());
        p.setCreated(Calendar.getInstance());
        p.setName("SimpleProject");

        return p;
    }
}
