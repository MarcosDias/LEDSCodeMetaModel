package model.domainLayer;

import lombok.Getter;

/**
 * @author MarcosDias
 */
@Getter
public enum CollectionType {
    SET("Set"),LIST("List");
    
    private String valor;

    CollectionType(String valor) {
		this.valor = valor;
	}

	public static CollectionType fromString(String _valor) {
		if (_valor != null) {
			for (CollectionType v : CollectionType.values()) {
				if (_valor.equalsIgnoreCase(v.valor)) {
					return v;
				}
			}
		}
		return null;
	}
}
