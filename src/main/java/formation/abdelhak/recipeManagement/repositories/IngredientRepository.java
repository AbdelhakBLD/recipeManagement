package formation.abdelhak.recipeManagement.repositories;

import formation.abdelhak.recipeManagement.models.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {
}
