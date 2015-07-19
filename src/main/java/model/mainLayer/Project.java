package model.mainLayer;

import lombok.Getter;
import lombok.Setter;
import model.applicationLayer.Application;
import model.domainLayer.Domain;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;

import java.util.Calendar;
import java.util.Set;

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
    private Set<Domain> domains;
    private Set<Application> applications;
}
