package mainLayer;

import applicationLayer.Application;
import domainLayer.Domain;
import infrastructureLayer.Infrastructure;
import interfaceLayer.Interface;

import java.util.Calendar;
import java.util.Set;

/**
 * @author MarcosDias
 */
public class Project {
    private String name;
    private Calendar created;
    private Interface Interface;
    private Infrastructure infrastructure;
    private Set<Domain> domains;
    private Set<Application> applications;
}
