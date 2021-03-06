package model.domainLayer;

import lombok.Getter;

/**
 * @author MarcosDias
 */
@Getter
public enum PrimaryDateTypeEnum {

    STRINGVALUE("String"),
    INTVALUE("int"),
    INTEGER("Integer"),
    LONGVALUE("long"),
    OBJECTLONG("Long"),
    BOOLEAN("boolean"),
    OBJECTBOOLEAN("Boolean"),
    DOUBLE("double"),
    OBJECTDOUBLE("Double"),
    FLOAT("float"),
    SUPERFLOAT("Float"),
    DATETIME("Datetime");

    private String value;
    PrimaryDateTypeEnum(String _value) {
        value = _value;
    }
    
    public static PrimaryDateTypeEnum fromString(String _valor) {
		if (_valor != null) {
			for (PrimaryDateTypeEnum v : PrimaryDateTypeEnum.values()) {
				if (_valor.equals(v.value)) {
					return v;
				}
			}
		}
		return null;
	}
}
