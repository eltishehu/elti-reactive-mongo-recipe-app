package com.eltishehu.reactiveapp.repositories.reactive;

import com.eltishehu.reactiveapp.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by e.sh. on 12-Oct-18
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

    Mono<Category> findByDescription(String description);
}
