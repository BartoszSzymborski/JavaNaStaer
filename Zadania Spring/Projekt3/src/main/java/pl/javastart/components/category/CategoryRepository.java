package pl.javastart.components.category;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.components.category.Category;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Optional<Category>findByNameIgnoreCase(String name);
}
