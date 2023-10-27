package mg.tonymushah.itu.cloud.voiture.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.cloud.voiture.types.entities.Kilometrage;
import mg.tonymushah.itu.cloud.voiture.types.generics.ResultList;
import mg.tonymushah.itu.cloud.voiture.types.inputs.Pagination;

public interface KilometrageRepository extends CrudRepository<Kilometrage, UUID> {
    default ResultList<Kilometrage> getKilometrages(Pagination pagination, Optional<List<UUID>> ids){
        return ids.map(_ids -> {
            return new ResultList<Kilometrage>(StreamSupport.stream(this.findAllById(_ids).spliterator(), true), pagination);
        }).orElseGet(() -> {
            return new ResultList<Kilometrage>(StreamSupport.stream(this.findAll().spliterator(), true), pagination);
        });
    }
}
