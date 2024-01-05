package DersProgrami.DersProgramiYazGel1.services;

import DersProgrami.DersProgramiYazGel1.dataJPA.DersProgramiRepository;
import DersProgrami.DersProgramiYazGel1.entities.DersProgrami;
import DersProgrami.DersProgramiYazGel1.entities.HocaSaatleri;
import DersProgrami.DersProgramiYazGel1.entities.SinifSaatleri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DersProgramiService {

    @Autowired
    private final DersProgramiRepository dersProgramiRepository;

    @Autowired
     public DersProgramiService(DersProgramiRepository theRepo){
        this.dersProgramiRepository=theRepo;
    }

    public void dersler() {

    }

//    public void dersPrograminaDersEkle(int dersid, int hocaid, int gunid, String sinifid, Time baslangic, Time bitis) {
//        dersProgramiRepository.dersprograminaekle(dersid,hocaid,gunid,sinifid,baslangic,bitis);
//    }

    private Long hocaninCakisanDersleri(DersProgrami dersProgrami){
        HocaSaatleri tempHoca = new HocaSaatleri(dersProgrami.getHoca_id(),dersProgrami.getGun_id(),dersProgrami.getBaslangic_saat(),dersProgrami.getBitis_saat());

        List count = dersProgramiRepository.hocaDersiBul(tempHoca);
        return (Long) count.get(0);
    }

    private Long sinifinCakisanDersleri(DersProgrami dersProgrami){
        SinifSaatleri tempSinif = new SinifSaatleri(dersProgrami.getSinif_id(),dersProgrami.getGun_id(),dersProgrami.getBaslangic_saat(),dersProgrami.getBitis_saat());
        List countOfSinif=dersProgramiRepository.sinifDersiBul(tempSinif);
        return (Long) countOfSinif.get(0);
    }
    public String dersPrograminaEkle(DersProgrami dersProgrami) {
        Long cakisanHocaDersi = hocaninCakisanDersleri(dersProgrami);
        Long cakisanSinifDersi = sinifinCakisanDersleri(dersProgrami);

        System.out.println("hocanin cakisan dersi:"+cakisanHocaDersi);
        System.out.println("sinifin cakisan dersi:"+cakisanSinifDersi);

        if(cakisanSinifDersi != 0)
            return "Sınıf müsait değil";
        if(cakisanHocaDersi !=0)
            return "Hoca'nın belirtilen saatlerde dersi var.";

        else
        {
           dersProgramiRepository.dersKaydiniYap(dersProgrami);
            return "Kayıt başarıyla oluşturuldu";
        }

    }
}
