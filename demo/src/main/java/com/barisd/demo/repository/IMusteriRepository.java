package com.barisd.demo.repository;

import com.barisd.demo.repository.entity.Musteri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IMusteriRepository extends JpaRepository<Musteri,Long> {
    /**
     * find: kelimesi ile başlamamız gerekli.
     * by: işlem yapılacak bileşen adından önce yazılması gerekli.
     * [ad] : Kullanılan repository içindeki  entity içindeki arama yapılmak istenen fieldin
     * ilk karakteri büyük harfle olacak şekilde yazılmalıdır.
     *
     * findBy: tekil kayıt gelecekse kullanılması önerilir.
     * findAll: çoğul kayıt gelecekse kullanılması önerilir.
     */
    // select * from tblmusteri where ad=?
    List<Musteri> findByAd(String ad);

    // select * from tblmusteri where adres=?
    Musteri findByAdres(String musterininAdresi);

    //select * from tblmusteri where ad=? or adres=?
    Musteri findByAdOrAdres(String ad,String adres);

    //
    Musteri findByAdAndAdresAndTelefon(String ad,String adres,String Telefon);

    //bir ildeki müşteri listesini getir.
    List<Musteri> findAllByIl(String il);

    // Optional
    Optional<Musteri> findOptionalByAdAndTelefon(String ad,String tel);

    //Sıralamalar Order By
    List<Musteri> findAllByOrderByAdDesc();

    //limit -top
    List<Musteri> findTop3ByOrderByAd();

    // son x günde kaydedilenleri getir.
    // select * from tblmusteri where kayittarihi>?
    /*
    GreaterThan -> Büyüktür
    LessThan -> Küçüktür
    GreaterThanEqual ->Büyük eşittir
    LessThanEqual -> Küçük eşittir.
     */
    List<Musteri> findAllByKayittarihiGreaterThan(Long kayitzamani);

    /*
    Like
    Select * from tbl_musteri where ad LIKE '%a%'
    ifade='%a%' -> içinde a olanları getir.
    ifade='%a' -> a ile bitenleri getir
    ifade='a%' -> a ile başlayanlar
    DİKKAT DİKKAT % işaretlerini siz eklemelisiniz.

    findAllByAdLike('%a'); // bu şekilde çağrılır.
     */
    List<Musteri> findAllByAdLike(String ifade);

    /*
    StartingWith
     ifade='a%' -> a ile başlayanlar
     */
    List<Musteri> findAllByAdStartingWith(String ifade);

    /*
    EndingWith
    ifade='%a' -> a ile bitenleri getir
     */
    List<Musteri> findAllByAdEndingWithIgnoreCase(String ifade);

    /*
    Contains;
    ifade='%a%' -> içinde a olanları getir.
     */
    List<Musteri> findAllByAdContainsIgnoreCase(String ifade);

    /*
    NULL NOT NULL
     */
    List<Musteri> findAllByTelefonIsNull();









}
