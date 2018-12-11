package pl.javastart.data;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.model.TimeData;

public interface TimeDataRepository extends JpaRepository<TimeData, Long> {
}
