package model.domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class InternalServiceMethod extends ServiceMethod {
    private Method method;
    private Entity entity;
    
    public String methodAcess(){
    	return this.entity.name + this.entity.getRepository().getName() + this.method.getName();
    }
}
