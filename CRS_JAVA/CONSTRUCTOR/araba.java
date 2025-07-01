package CONSTRUCTOR;

public class araba {
    private String marka;
    private String model;
    private int uretimYili;
    private String renk;
    private double hiz;

    // tek, kapsamlı bir constructor
    public araba(String marka, String model, int uretimYili, String renk) {
        this.marka = marka;
        this.model = model;
        this.uretimYili = uretimYili;
        this.renk = renk;
        this.hiz = 0.0;
        System.out.println(marka + " " + model + " nesnesi oluşturuldu.");
    }

    // renk değiştirme methodu
    public void setRenk(String renk) {
        if (renk != null && !renk.trim().isEmpty()) {
            this.renk = renk;
            System.out.println("Arabanın rengi " + renk + " olarak değiştirildi.");
        } else {
            System.out.println("Geçersiz renk.");
        }
    }

    // hız arttırma metodu
    public void hizlan(double miktar) {
        if (miktar > 0) {
            this.hiz += miktar;
            System.out.println("Hızınız " + miktar + " arttı. Güncel hız: " + this.hiz + " km/s");
        } else {
            System.out.println("Hızlanma miktarı pozitif olmalı.");
        }
    }

    // araba bilgilerini ekrana yazdırmak için bir method
    public void bilgileriGoster() {
        System.out.println("\n--- Araba Bilgileri ---");
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Üretim yılı: " + this.uretimYili);
        System.out.println("Renk: " + this.renk);
        System.out.println("Güncel Hız: " + this.hiz + " km/s");
        System.out.println("-------------------");
    }
}
