package test.util;

import java.util.ArrayList;
import java.util.Calendar;

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
        p.setApplications(new ArrayList<Application>());
        p.setDomains(new ArrayList<Domain>());
        p.setInfrastructure(new Infrastructure());
        p.setIface(new Interface());
        p.setCreated(Calendar.getInstance());
        p.setName("SimpleProject");

        return p;
    }
}
