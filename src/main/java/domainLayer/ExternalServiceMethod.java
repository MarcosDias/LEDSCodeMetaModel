package domainLayer;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public abstract class ExternalServiceMethod {
    private String service;
    private Set<Service> services;
}
