package DersProgrami.DersProgramiYazGel1.services;

import DersProgrami.DersProgramiYazGel1.dataJPA.SinifRepository;
import DersProgrami.DersProgramiYazGel1.entities.Sinif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinifService {
    private final SinifRepository sinifRepository;

    @Autowired
    public SinifService(SinifRepository sinifRepository) {
        this.sinifRepository = sinifRepository;
    }

    public Sinif sinifEkle(Sinif sinif) {
        return sinifRepository.save(sinif);
    }

    public List<Sinif> siniflariGetir() {
        return sinifRepository.findAll();
    }
}
