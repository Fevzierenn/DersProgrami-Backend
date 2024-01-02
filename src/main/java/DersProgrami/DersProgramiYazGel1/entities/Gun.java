package DersProgrami.DersProgramiYazGel1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "gunler")
@Getter
@Setter
public class Gun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gun_id")
    private int id;

    @Column(name = "gun")
    private String gun;
}
