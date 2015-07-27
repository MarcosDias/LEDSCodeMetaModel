package model.applicationLayer;

import lombok.Getter;
import lombok.Setter;
import model.domainLayer.Domain;

@Getter
@Setter
public class SpecificApplicationDomain extends SpecificApplication{
	private Domain domain;
}
