package esprit.tn.microserviceatelier1.repositories;

import esprit.tn.microserviceatelier1.entities.Condidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CondidatRepository extends JpaRepository<Condidat, Integer> {
    public Page<Condidat> getCondidatsByNom(@Param("name") String n, Pageable pageable);
}
