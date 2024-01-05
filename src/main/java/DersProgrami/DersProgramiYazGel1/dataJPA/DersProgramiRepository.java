package DersProgrami.DersProgramiYazGel1.dataJPA;

import DersProgrami.DersProgramiYazGel1.entities.DersProgrami;
import DersProgrami.DersProgramiYazGel1.entities.HocaSaatleri;
import DersProgrami.DersProgramiYazGel1.entities.SinifSaatleri;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class DersProgramiRepository {

    @Autowired
    private EntityManager entityManager;

    public List hocaDersiBul(HocaSaatleri hoca){
        Query q =entityManager.createNativeQuery("select count(*) from ders_programi\n" +
                "where hoca_id= :id and gun_id= :gunid and (bitis_saat between :start and :finish or baslangic_saat between :start and :finish)");
        q.setParameter("id",hoca.getHoca_id());
        q.setParameter("start",hoca.getBaslangic_saat());
        q.setParameter("finish", hoca.getBitis_saat());
        q.setParameter("gunid",hoca.getGun_id());
        return q.getResultList();
    }

    public List sinifDersiBul(SinifSaatleri tempSinif) {
        Query q = entityManager.createNativeQuery("select count(*) from ders_programi\n" +
                " where gun_id = :gunid  and sinif_id = :sinifid and (bitis_saat between :start and :finish or baslangic_saat between :start and :finish)");
        q.setParameter("sinifid",tempSinif.getSinif_id());
        q.setParameter("start",tempSinif.getBaslangic_saat());
        q.setParameter("finish", tempSinif.getBitis_saat());
        q.setParameter("gunid",tempSinif.getGun_id());
        return q.getResultList();
    }
    @Transactional
    public void dersKaydiniYap(DersProgrami dersProgrami) {
        Query q =entityManager.createNativeQuery("insert into ders_programi (ders_id,hoca_id,sinif_id,gun_id,baslangic_saat,bitis_saat) values " +
                "( :dersid,:hocaid, :sinifid,:gunid,:start,:finish)");
        q.setParameter("dersid",dersProgrami.getDers_id());
        q.setParameter("hocaid",dersProgrami.getHoca_id());
        q.setParameter("sinifid",dersProgrami.getSinif_id());
        q.setParameter("gunid",dersProgrami.getGun_id());
        q.setParameter("start", dersProgrami.getBaslangic_saat());
        q.setParameter("finish", dersProgrami.getBitis_saat());
        q.executeUpdate();
    }
}

