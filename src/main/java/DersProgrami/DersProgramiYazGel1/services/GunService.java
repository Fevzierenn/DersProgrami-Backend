package DersProgrami.DersProgramiYazGel1.services;

import DersProgrami.DersProgramiYazGel1.dataJPA.GunRepository;
import DersProgrami.DersProgramiYazGel1.entities.Gun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GunService {

    private final GunRepository gunRepository;
    @Autowired
    public GunService(GunRepository gunRepo){
        this.gunRepository=gunRepo;
    }

    public List<Gun> gunleriGetir() {
        return gunRepository.findAll();
    }
}
