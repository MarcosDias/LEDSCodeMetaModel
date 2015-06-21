package util.defaultDomain;

import model.domainLayer.Domain;
import model.domainLayer.Module;

/**
 * @author MarcosDias
 */
public class DefaulDomainProject {
    private static Domain domain;

    public static Domain create() {
        domain.setName("Sincap");
        domain.getModules().add(createDefaultModule());
        return domain;
    }

    private static Module createDefaultModule() {
        Module module = new Module();
        module.setName("controleInterno");

        return null;
    }
}
