package mg.tonymushah.itu.cloud.voiture.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.cloud.voiture.types.entities.Vehicule;
import mg.tonymushah.itu.cloud.voiture.types.generics.ResultList;
import mg.tonymushah.itu.cloud.voiture.types.inputs.Pagination;

public interface VehiculeRepository extends CrudRepository<Vehicule, String> {
    default ResultList<Vehicule> getVehicules(Pagination pagination, Optional<List<String>> ima){
        return ima.map(imas -> {
            return new ResultList<Vehicule>(StreamSupport.stream(this.findAllById(imas).spliterator(), true), pagination);
        }).orElseGet(() -> {
            return new ResultList<Vehicule>(StreamSupport.stream(this.findAll().spliterator(), true), pagination);
        });
    }
}
