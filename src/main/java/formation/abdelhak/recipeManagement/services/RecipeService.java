package formation.abdelhak.recipeManagement.services;

import formation.abdelhak.recipeManagement.models.Recipe;
import formation.abdelhak.recipeManagement.repositories.RecipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecipeService {

    private RecipeRepository repository;

    public RecipeService(RecipeRepository repository){
        this.repository = repository;
    }

    public List<Recipe> findAll() {
        return repository.findAll();
    }

    public Recipe insert(Recipe entity) {
        return repository.insert(entity);
    }

    public Recipe save(Recipe entity) {
        return repository.save(entity);
    }

    public Recipe findById(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "La recette d'id "+id+" n'existe pas."));
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
