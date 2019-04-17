package it.house.recipe.repositories;

import it.house.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Created by max on 2019-04-12
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
