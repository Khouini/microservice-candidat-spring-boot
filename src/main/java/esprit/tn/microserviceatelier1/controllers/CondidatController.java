package esprit.tn.microserviceatelier1.controllers;

import esprit.tn.microserviceatelier1.entities.Condidat;
import esprit.tn.microserviceatelier1.services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("condidats")
public class CondidatController {
   private CondidatService condidatService = new CondidatService();
    @GetMapping("")
    public ResponseEntity<?> getAll(){
        List<Condidat> condidats = condidatService.getAll();
        return ResponseEntity.ok(condidats);
    }
}
