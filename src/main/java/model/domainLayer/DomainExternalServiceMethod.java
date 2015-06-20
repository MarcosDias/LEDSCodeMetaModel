package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class DomainExternalServiceMethod extends ExternalServiceMethod {
    private String domain;
    private String module;
}
