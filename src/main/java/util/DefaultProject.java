package util;

import lombok.AllArgsConstructor;
import model.applicationLayer.Application;
import model.mainLayer.Project;
import util.defaultInfrastructure.DefaultInfrastructureProject;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MarcosDias
 *
 * Constroi uma instancia especifica de Projet
 * esse instancia foi baseado em um modulo do
 * <a href="http://leds.sr.ifes.edu.br/portfolio/sincap/">
 *     Sincap – Sistema de Informação de Notificação e Captação de Córnea
 * </a>.
 */
@AllArgsConstructor
public class DefaultProject {
    private static Project project;

    public static Project create() {
        project = new Project();
        project.setName("Modulo Sincap");
        project.setCreated(Calendar.getInstance());
        project.setInfrastructure(DefaultInfrastructureProject.create());


        project.setApplications(createDefaultSetApplication());

        return project;
    }

    private static Set<Application> createDefaultSetApplication() {
        Set<Application> applications = new HashSet<Application>();
        applications.add(createDefaultApplication());
        return applications;
    }

    private static Application createDefaultApplication() {
        Application app = new Application();
        app.setName("");
//        app.set

        return null;
    }
}
