package esprit.tn.microserviceatelier1.controllers;

import esprit.tn.microserviceatelier1.entities.Condidat;
import esprit.tn.microserviceatelier1.repositories.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("condidats")
public class CondidatController {
    @Autowired
    private CondidatRepository condidatRepository;
    @GetMapping("")
    public ResponseEntity<?> getAll(){
        List<Condidat> condidats = condidatRepository.findAll();
        return ResponseEntity.ok(condidats);
    }

    @PostMapping("")
    public ResponseEntity<?> addCondidat(@RequestBody Condidat condidat){
        Condidat condidat1 = condidatRepository.save(condidat);
        return ResponseEntity.ok(condidat1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCondidat(@PathVariable("id") Integer id, Condidat condidat){
        condidat.setId(id);
        Condidat condidat1 = condidatRepository.save(condidat);
        return ResponseEntity.ok(condidat1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCondidat(@PathVariable("id") Integer id){
        condidatRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }
}
