package CONSTRUCTOR;

public class Main {
    public static void main(String[] args) {

        // tek constructor ile nesne oluşturma
        araba araba1 = new araba("Mercedes", "C200", 2024, "Siyah");
        araba1.bilgileriGoster();
        araba1.hizlan(80);
        araba1.setRenk("Beyaz");
        araba1.bilgileriGoster();

        araba araba2 = new araba("BMW", "X5", 2023, "Lacivert");
        araba2.bilgileriGoster();
        araba2.hizlan(120);
        araba2.bilgileriGoster();
    }

}
