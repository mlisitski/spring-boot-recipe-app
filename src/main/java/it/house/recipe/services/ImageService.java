package it.house.recipe.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by max 8/4/19.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
