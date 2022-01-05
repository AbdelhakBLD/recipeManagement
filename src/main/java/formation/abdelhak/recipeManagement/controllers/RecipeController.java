package formation.abdelhak.recipeManagement.controllers;

import formation.abdelhak.recipeManagement.models.Recipe;
import formation.abdelhak.recipeManagement.services.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipes")
@CrossOrigin
public class RecipeController {

    private RecipeService service;

    public RecipeController(RecipeService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Recipe> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public Recipe insert(@RequestBody Recipe entity) {
        return service.insert(entity);
    }

    @PutMapping("")
    public Recipe save(@RequestBody Recipe entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Recipe findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
