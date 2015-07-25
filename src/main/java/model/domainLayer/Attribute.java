package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Getter
@Setter
public class Attribute extends SuperAttribute {
    private AccessModifier accessModifier;
    
    public String genericType(){
    	if(this.datetype instanceof SuperClass){
    		SuperClass sClass =  (SuperClass) this.datetype;
    		return sClass.getName();
    	}
    	else {
    		PrimaryDateType primaryDateType = (PrimaryDateType) this.datetype;
    		return primaryDateType.getType().getValue();
    	}
    	
    }
}
