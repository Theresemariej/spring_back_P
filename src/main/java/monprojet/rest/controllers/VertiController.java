package monprojet.rest.controllers;

import monprojet.business.VertiService;
import monprojet.dto.model.VertiDTO;
import monprojet.dao.entities.Verti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VertiController {

    @Autowired
    private VertiService vertiService;


    //Adresse du front
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/verti/getLibelle/{id}")
    @ResponseStatus(HttpStatus.OK)
    //Path Variable correspond au nom du paramètre ajouté au chemin
    public Verti getVertiId(@PathVariable(value = "id") int id) {
        return vertiService.getVertiById(id);
    }

    //Adresse du front
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/verti")
    @ResponseStatus(HttpStatus.OK)
    //Path Variable correspond au nom du paramètre ajouté au chemin
    public List<Verti> getVerti() {
        return vertiService.getAllVerti();
    }
}