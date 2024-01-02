package DersProgrami.DersProgramiYazGel1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "hocalar")
@Getter
@Setter
public class Hoca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoca_id")
    private int id;

    @Column(name = "isim")
    private String hocaIsmi;

    @Column(name = "soyisim")
    private String hocaSoyIsmi;
}
