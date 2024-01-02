package DersProgrami.DersProgramiYazGel1.dataJPA;

import DersProgrami.DersProgramiYazGel1.entities.Ders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DersRepository extends JpaRepository<Ders, Integer> {
}
