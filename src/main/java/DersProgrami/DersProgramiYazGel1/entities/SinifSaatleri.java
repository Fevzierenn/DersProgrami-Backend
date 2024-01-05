package DersProgrami.DersProgramiYazGel1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinifSaatleri {

    String sinif_id;
    int gun_id;
    LocalTime baslangic_saat;
    LocalTime bitis_saat;
}
