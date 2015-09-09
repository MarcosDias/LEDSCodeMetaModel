package model.infrastructureLayer;

import lombok.Getter;

/**
 * @author MarcosDias
 */
@Getter
public enum Environment {
	DEV("dev"), PROD("prod");

	private String valor;

	Environment(String valor) {
		this.valor = valor;
	}

	public static Environment fromString(String _valor) {
		if (_valor != null) {
			for (Environment v : Environment.values()) {
				if (_valor.equals(v.valor)) {
					return v;
				}
			}
		}
		return null;
	}
}
