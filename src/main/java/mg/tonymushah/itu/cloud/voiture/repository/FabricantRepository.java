package mg.tonymushah.itu.cloud.voiture.repository;

import java.util.Optional;
import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.cloud.voiture.types.entities.Frabicant;
import mg.tonymushah.itu.cloud.voiture.types.generics.ResultList;
import mg.tonymushah.itu.cloud.voiture.types.inputs.Pagination;

public interface FabricantRepository extends CrudRepository<Frabicant, UUID> {
    default ResultList<Frabicant> getFabricants(Pagination pagination, Optional<List<UUID>> ids){
        return ids.map(_ids -> {
            return new ResultList<Frabicant>(StreamSupport.stream(this.findAllById(_ids).spliterator(), true), pagination);
        }).orElseGet(() -> {
            return new ResultList<Frabicant>(StreamSupport.stream(this.findAll().spliterator(), true), pagination);
        });
    }
}
