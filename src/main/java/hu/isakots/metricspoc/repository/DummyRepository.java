package hu.isakots.metricspoc.repository;

import org.springframework.data.repository.CrudRepository;
import hu.isakots.metricspoc.entity.DummyEntity;

public interface DummyRepository extends CrudRepository<DummyEntity, Long> {
}
