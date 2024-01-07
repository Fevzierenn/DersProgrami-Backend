package DersProgrami.DersProgramiYazGel1.rest;

import DersProgrami.DersProgramiYazGel1.entities.*;
import DersProgrami.DersProgramiYazGel1.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    @Autowired
    private GunService gunService;

    @GetMapping
    private String sayHello(){
        return "hello everybody";
    }
    @GetMapping("/dersler")
    private List<Ders> dersleriGor(){
        return dersService.desleriGor();
    }
    @GetMapping("/hocalar")
    private List<Hoca> hocalariGor(){
        return hocaService.hocalariGetir();
    }
    @GetMapping("/siniflar")
    private List<Sinif> siniflariGor(){
        return sinifService.siniflariGetir();
    }

    @GetMapping("/gunler")
    private List<Gun> gunleriGor(){
        return gunService.gunleriGetir();
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
    private ResponseEntity dersProgramiEkle(@RequestBody DersProgrami dersProgrami){
        return dersProgramiService.dersPrograminaEkle(dersProgrami);
    }

    @DeleteMapping("/tablodanderssil/{id}")
    private void dersProgramindanDersSil(@PathVariable int id){
         dersProgramiService.dersProgramindanDersSil(id);
    }

    @GetMapping("/dersprogramigetir")
    private List<TabloDegerleri> dersPrograminiGetir(){
        return dersProgramiService.dersProgramiGetir();
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
