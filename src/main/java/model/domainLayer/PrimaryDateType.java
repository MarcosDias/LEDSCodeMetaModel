package model.domainLayer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author MarcosDias
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryDateType extends Classifier {
    private PrimaryDateTypeEnum type;
}
