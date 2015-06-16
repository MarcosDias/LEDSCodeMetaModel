package domainLayer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
public class PrimaryDateType extends Classifier {
    private PrimaryDateTypeEnum type;
}
