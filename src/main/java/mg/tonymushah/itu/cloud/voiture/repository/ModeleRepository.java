package mg.tonymushah.itu.cloud.voiture.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.cloud.voiture.types.entities.Modele;
import mg.tonymushah.itu.cloud.voiture.types.generics.ResultList;
import mg.tonymushah.itu.cloud.voiture.types.inputs.Pagination;

public interface ModeleRepository extends CrudRepository<Modele, UUID> {
    default ResultList<Modele> getModeles(Pagination pagination, Optional<List<UUID>> ids){
        return ids.map(_ids -> {
            return new ResultList<Modele>(StreamSupport.stream(this.findAllById(_ids).spliterator(), true), pagination);
        }).orElseGet(() -> {
            return new ResultList<Modele>(StreamSupport.stream(this.findAll().spliterator(), true), pagination);
        });
    }
}
