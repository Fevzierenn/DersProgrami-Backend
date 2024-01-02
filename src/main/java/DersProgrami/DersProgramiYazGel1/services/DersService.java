package DersProgrami.DersProgramiYazGel1.services;

import DersProgrami.DersProgramiYazGel1.dataJPA.DersRepository;
import DersProgrami.DersProgramiYazGel1.entities.Ders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DersService {

    private final DersRepository dersRepository;

    @Autowired
    public DersService(DersRepository dersRepository) {
        this.dersRepository = dersRepository;
    }

    public Ders dersEkle(Ders ders) {
        return dersRepository.save(ders);
    }
}
