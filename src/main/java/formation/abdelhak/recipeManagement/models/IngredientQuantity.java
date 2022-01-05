package formation.abdelhak.recipeManagement.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class IngredientQuantity {
    @Id
    private String id;

    private float quantity;
}