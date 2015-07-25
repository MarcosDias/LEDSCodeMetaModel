package model.domainLayer;

import java.util.LinkedHashSet;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public abstract class ExternalServiceMethod {
    private String service;
    private LinkedHashSet<Service> services;
}
