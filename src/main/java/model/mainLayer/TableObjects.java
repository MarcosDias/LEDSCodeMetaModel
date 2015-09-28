package model.mainLayer;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
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
	private List<Domain> domains;
	private List<Application> apps;
	private List<Module> modules;
	private List<Entity> entities;
	private List<Service> services;
	private List<ClassEnum> enums;
	
	public TableObjects() {
		domains = new ArrayList<Domain>();
		apps = new ArrayList<Application>();
		modules = new ArrayList<Module>();
		entities = new ArrayList<Entity>();
		services = new ArrayList<Service>();
		enums = new ArrayList<ClassEnum>();
	}
}
