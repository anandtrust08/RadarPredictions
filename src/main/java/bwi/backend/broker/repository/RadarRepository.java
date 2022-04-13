package bwi.backend.broker.repository;

import bwi.backend.broker.api.dto.EinzelnachrichtRequestDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadarRepository extends CrudRepository<EinzelnachrichtRequestDto, Long> {
}
