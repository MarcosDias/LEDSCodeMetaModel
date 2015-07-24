package model.domainLayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
@AllArgsConstructor
public class PrimaryDateType extends Classifier {
    private PrimaryDateTypeEnum type;
}
