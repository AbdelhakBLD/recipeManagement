package formation.abdelhak.recipeManagement.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
public class IngredientQuantity {

    private float quantity;
    @DBRef
    private Ingredient ingredient;
}