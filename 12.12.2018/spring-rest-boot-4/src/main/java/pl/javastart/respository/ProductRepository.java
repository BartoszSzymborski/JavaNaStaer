package pl.javastart.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.javastart.model.Product;

@RepositoryRestResource
//W przypadku Spring Data adnotacja @Repository była opcjonalna i dodawaliśmy ją dla czytelności. W przypadku Spring Data REST dodanie adnotacji @Repository lub @RepositoryRestResource jest wymagane (o ile nie zmienimy domyślnej konfiguracji). @RepositoryRestResource poprzez dodatkowe atrybuty daje nam lepszą kontrolę nad udostępnianym zasobem.
public interface ProductRepository extends JpaRepository<Product, Long> {
}
