package formation.abdelhak.recipeManagement.services;

import formation.abdelhak.recipeManagement.models.Ingredient;
import formation.abdelhak.recipeManagement.repositories.IngredientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IngredientService {

    private IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public List<Ingredient> findAll() {
        return repository.findAll();
    }

    public Ingredient insert(Ingredient entity) {
        return repository.insert(entity);
    }

    public Ingredient save(Ingredient entity) {
        return repository.save(entity);
    }

    public Ingredient findById(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "L'ingredient d'id "+id+" n'existe pas."));
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
