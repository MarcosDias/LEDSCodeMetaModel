package model.mainLayer;

import java.util.Calendar;
import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;
import model.applicationLayer.Application;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class Project {
    private String name;
    private Calendar created;
    private Interface iface;
    private Infrastructure infrastructure;
    private LinkedHashSet<Domain> domains;
    private LinkedHashSet<Application> applications;
}
