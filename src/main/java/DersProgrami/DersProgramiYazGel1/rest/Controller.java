package DersProgrami.DersProgramiYazGel1.rest;

import DersProgrami.DersProgramiYazGel1.entities.Ders;
import DersProgrami.DersProgramiYazGel1.entities.Hoca;
import DersProgrami.DersProgramiYazGel1.entities.Sinif;
import DersProgrami.DersProgramiYazGel1.services.DersService;
import DersProgrami.DersProgramiYazGel1.services.HocaService;
import DersProgrami.DersProgramiYazGel1.services.SinifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("program")
public class Controller {

    @Autowired
    private DersService dersService;
    @Autowired
    private HocaService hocaService;
    @Autowired
    private SinifService sinifService;

    @GetMapping("dersekle/{Ders}")
    public Ders dersEkle(@PathVariable(name = "Ders") String dersIsmi)
    {
        Ders ders = new Ders(dersIsmi);
        return dersService.dersEkle(ders);
    }

    @PostMapping("hocaekle")
    private Hoca hocaEkle(@RequestBody Hoca hoca){
        return hocaService.hocaEkle(hoca);
    }

    @PostMapping("sinifekle")
    private Sinif sinifEkle(@RequestBody Sinif sinif){
        return sinifService.sinifEkle(sinif);
    }

}
