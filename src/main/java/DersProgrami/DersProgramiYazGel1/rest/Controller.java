package DersProgrami.DersProgramiYazGel1.rest;

import DersProgrami.DersProgramiYazGel1.entities.Ders;
import DersProgrami.DersProgramiYazGel1.entities.DersProgrami;
import DersProgrami.DersProgramiYazGel1.entities.Hoca;
import DersProgrami.DersProgramiYazGel1.entities.Sinif;
import DersProgrami.DersProgramiYazGel1.services.DersProgramiService;
import DersProgrami.DersProgramiYazGel1.services.DersService;
import DersProgrami.DersProgramiYazGel1.services.HocaService;
import DersProgrami.DersProgramiYazGel1.services.SinifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;
@CrossOrigin()
@RestController
@RequestMapping("program")
public class Controller {

    @Autowired
    private DersService dersService;
    @Autowired
    private HocaService hocaService;
    @Autowired
    private SinifService sinifService;
    @Autowired
    private DersProgramiService dersProgramiService;

    @GetMapping
    private String sayHello(){
        return "hello everybody";
    }
    @GetMapping("/dersler")
    private List<Ders> dersleriGor(){
        return dersService.desleriGor();
    }
    @PostMapping(value = "/dersekle")
    public Ders dersEkle(@RequestBody Ders ders)
    {
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


    @PostMapping("/derskoy")
    private String dersProgramiEkle(@RequestBody DersProgrami dersProgrami){
        return dersProgramiService.dersPrograminaEkle(dersProgrami);
    }


//    @PostMapping("/derskoy/{dersid}/{hocaid}/{gunid}/{sinifid}/{baslangic}/{bitis}")
//    private void dersPrograminaDersKoy(@PathVariable int dersid, @PathVariable int hocaid,
//                                       @PathVariable int gunid, @PathVariable String sinifid,
//                                       @PathVariable Time baslangic, @PathVariable Time bitis
//                                       ){
//        System.out.println("dersid:"+dersid+ " hocaid:"+ hocaid);
//        dersProgramiService.dersPrograminaDersEkle(dersid,hocaid,gunid,sinifid,baslangic,bitis);
//    }

}
