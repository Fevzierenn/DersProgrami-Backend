package DersProgrami.DersProgramiYazGel1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="siniflar")
@Getter
@Setter
public class Sinif {

    @Id
    @Column(name = "sinif_id")
    private String id;

    @Column(name = "sinif_aciklama")
    private String sinifAciklama;
}
