package DersProgrami.DersProgramiYazGel1.services;

import DersProgrami.DersProgramiYazGel1.dataJPA.HocaRepository;
import DersProgrami.DersProgramiYazGel1.entities.Hoca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HocaService {


    private final HocaRepository hocaRepository;

    @Autowired
    public HocaService(HocaRepository hocaRepository) {
        this.hocaRepository = hocaRepository;
    }

    public Hoca hocaEkle(Hoca hoca) {
        return hocaRepository.save(hoca);
    }
}
