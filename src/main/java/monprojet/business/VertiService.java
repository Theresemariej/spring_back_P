package monprojet.business;

import monprojet.dao.entities.Verti;
import monprojet.dao.repositories.VertiRepository;
import monprojet.dto.mappers.VertiMapper;
import monprojet.dto.model.VertiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VertiService {

    // Deux options pour importer un Repository soit on le declare et on lui déclare un constructeur soit on utilise
    // l'annotation @Autowired
    // Option 1
    private final VertiRepository vertiRepository;

    public VertiService(VertiRepository vertiRepository) {
        this.vertiRepository = vertiRepository;
    }

    // Option 2
    // @Autowired
    // private final CountryRepository countryRepository;

    @Autowired
    private VertiMapper countryMapper;

    public Verti getVertiById(int id){
        return vertiRepository.findById(id).orElse(null);
    }

    public List<Verti> getAllVerti(){
        List<Verti> liste = vertiRepository.findAll();
        return liste;
    }
}