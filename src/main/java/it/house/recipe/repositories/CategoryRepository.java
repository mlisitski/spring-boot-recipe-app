package it.house.recipe.repositories;

import it.house.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by max on 2019-04-12
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    //Automatic conversion to Hibernate JPA Query
    Optional<Category> findByDescription(String description);

}
