package it.house.recipe.services;

import it.house.recipe.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by max on 2019-05-07
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
