package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public abstract class SuperAttribute {
	protected Classifier datetype;
	protected CollectionType collectionType;
	
	public String genericType(){
    	if(this.datetype instanceof SuperClass){
    		SuperClass sClass =  (SuperClass) this.datetype;
    		return this.addCollectionString(sClass.getName());
    	}
    	else {
    		PrimaryDateType primaryDateType = (PrimaryDateType) this.datetype;
    		return this.addCollectionString(primaryDateType.getType().getValue());
    	}
    }
	
	private String addCollectionString(String typeString){
		if(this.collectionType != null){
			return this.collectionType.getValor() + "<" + typeString + ">";
		}
		return typeString;
	}
}
