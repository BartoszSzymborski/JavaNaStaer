package pl.javastart.equipy.components.assigment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssigmentRepository extends JpaRepository<Assigment,Long> {
    Optional<Assigment>findByAsset_IdAndEndIsNull(Long assetId);
}
