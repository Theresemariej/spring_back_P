package monprojet.dto.mappers;

import monprojet.dao.entities.Verti;
import monprojet.dto.model.VertiDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses ={VertiMapper.class})
public interface VertiMapper {

    /**
     * Méthode générée automatiquement permettant de transformer une CountryEntity en CountryDTO
     * @param verti Ville à transformer en objet DTO
     * @return CountryDTO, objet à envoyer au front
     */
    VertiDTO toCountryDTO(Verti verti);
}