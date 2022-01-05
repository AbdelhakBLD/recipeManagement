package formation.abdelhak.recipeManagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    private String id;

    private String name;
    private String description;
    private String author;

    private List<IngredientQuantity> ingredientQuantities = new ArrayList<>();
    private List<Step> stepList = new ArrayList<>();
}
