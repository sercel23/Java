import java.io.*;
public class Calisan_Serileştirme implements Serializable{ //implement işlemi
	private String ad; //değişken tanımlama
	private String soyad;
	
	public Calisan_Serileştirme(String ad, String soyad) { //constructur
		this.ad=ad;
		this.soyad=soyad;
	}
	public String getAd() { //getter metodları
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
}

