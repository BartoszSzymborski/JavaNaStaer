package pl.javastart.equipy.inventory.asset;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset, Long> {
    @Query("SELECT a FROM Asset a WHERE LOWER(a.name) LIKE LOWER(CONCAT('%',:search,'%') )" +
    "OR LOWER(a.serialNumber) LIKE LOWER(CONCAT('%',:search,'%') ) ")
    List<Asset>findAllByNameOrSerialNumber(@Param("search")String search);

    Optional<Asset>findBySerialNumber(String serialNumber);

}
