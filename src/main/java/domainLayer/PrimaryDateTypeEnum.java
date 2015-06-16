package domainLayer;

/**
 * @author MarcosDias
 */
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
    DATETIME("DatiTime"),
    OBJECT("Object");

    private String value;
    PrimaryDateTypeEnum(String _value) {
        value = _value;
    }
}
