package DersProgrami.DersProgramiYazGel1.dataJPA;

import DersProgrami.DersProgramiYazGel1.entities.Gun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GunRepository extends JpaRepository<Gun,Integer> {
}
