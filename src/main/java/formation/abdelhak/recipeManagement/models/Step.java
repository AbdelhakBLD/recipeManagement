package formation.abdelhak.recipeManagement.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Step {

    private int number;
    private String description;
    private int duration;
}
