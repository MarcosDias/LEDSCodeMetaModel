package model.interfaceLayer;


/**
 * @author MarcosDias
 */
public enum Type {
    HTMLVIEW("HtmlView"), RESTFULL("RestFull");
    
    private String valor;

	Type(String valor) {
		this.valor = valor;
	}
    
    public static Type fromString(String _valor) {
		if (_valor != null) {
			for (Type v : Type.values()) {
				if (_valor.equalsIgnoreCase(v.valor)) {
					return v;
				}
			}
		}
		return null;
	}
}
