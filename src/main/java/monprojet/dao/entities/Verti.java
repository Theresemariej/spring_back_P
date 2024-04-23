package monprojet.dao.entities;
import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Verti {

    // Identifiant technique
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Identifiant métier (code ISO)
    @Column
    @NonNull
    private String libelle;

    @Column
    @NonNull
    private String oui;

    @Column
    private String non;

}