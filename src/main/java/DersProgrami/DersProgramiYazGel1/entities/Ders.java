package DersProgrami.DersProgramiYazGel1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name =  "dersler")
@Getter
@Setter

public class Ders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ders_id")
    private int id;

    @Column(name = "ders_isim")
    private String dersIsmi;

    public Ders(String dersIsmi){
        this.dersIsmi=dersIsmi;
    }


}
