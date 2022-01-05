package formation.abdelhak.recipeManagement.repositories;

import formation.abdelhak.recipeManagement.models.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
