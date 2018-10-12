package com.eltishehu.reactiveapp.repositories.reactive;

import com.eltishehu.reactiveapp.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by e.sh. on 12-Oct-18
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
