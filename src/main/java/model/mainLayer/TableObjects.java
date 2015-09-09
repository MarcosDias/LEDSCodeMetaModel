package model.mainLayer;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.applicationLayer.Application;
import model.domainLayer.ClassEnum;
import model.domainLayer.Domain;
import model.domainLayer.Entity;
import model.domainLayer.Module;
import model.domainLayer.Service;
import model.infrastructureLayer.Infrastructure;
import model.interfaceLayer.Interface;

@Getter
@Setter
public class TableObjects {
	private Project project;
	private Interface iface;
	private Infrastructure infrastructure;
	private Set<Domain> domains;
	private Set<Application> apps;
	private Set<Module> modules;
	private Set<Entity> entities;
	private Set<Service> services;
	private Set<ClassEnum> enums;
	
	public TableObjects() {
		domains = new LinkedHashSet<Domain>();
		apps = new LinkedHashSet<Application>();
		modules = new LinkedHashSet<Module>();
		entities = new LinkedHashSet<Entity>();
		services = new LinkedHashSet<Service>();
		enums = new LinkedHashSet<ClassEnum>();
	}
}
