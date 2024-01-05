package DersProgrami.DersProgramiYazGel1.entities;

import jakarta.persistence.*;
import jakarta.transaction.TransactionScoped;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;


@Entity
@Table(name = "ders_programi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DersProgrami {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="ders_id")
    private int ders_id;

    @Column(name="hoca_id")
    private int hoca_id;

    @Column(name = "sinif_id")
    private String sinif_id;

    @Column(name = "gun_id")
    private int gun_id;

    @Column(name = "baslangic_saat")
    private LocalTime baslangic_saat;

    @Column(name = "bitis_saat")
    private LocalTime bitis_saat;

}
