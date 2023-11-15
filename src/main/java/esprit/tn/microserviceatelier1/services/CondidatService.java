package esprit.tn.microserviceatelier1.services;

import esprit.tn.microserviceatelier1.entities.Condidat;
import esprit.tn.microserviceatelier1.repositories.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondidatService {
    @Autowired
    private CondidatRepository condidatRepository;

    public List<Condidat> getAll(){
        return condidatRepository.findAll();
    }

    public Condidat addCondidat(Condidat condidat){
        return condidatRepository.save(condidat);
    }

    public Condidat updateCondidat(Integer id ,Condidat condidat){
        condidat.setId(id);
        return condidatRepository.save(condidat);
    }

    public void deleteCondidat(Integer id){
        condidatRepository.deleteById(id);
    }
}
