package DersProgrami.DersProgramiYazGel1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HocaSaatleri {
    int hoca_id;
    int gun_id;
    LocalTime baslangic_saat;
    LocalTime bitis_saat;
}
