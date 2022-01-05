package formation.abdelhak.recipeManagement.controllers;

import formation.abdelhak.recipeManagement.models.Ingredient;
import formation.abdelhak.recipeManagement.services.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ingredients")
@CrossOrigin
public class IngredientController {
    private IngredientService service;

    public IngredientController(IngredientService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Ingredient> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public Ingredient insert(@RequestBody Ingredient entity) {
        return service.insert(entity);
    }

    @PutMapping("")
    public Ingredient save(@RequestBody Ingredient entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Ingredient findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }

}