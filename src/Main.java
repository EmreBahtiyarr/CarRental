import java.util.Scanner;

public class Main {

    static int toplamFiyat;

    public static void main(String[] args) {

        int op = 0, secim, secimEk, gun;

        Scanner scanner = new Scanner(System.in);

        bmw BMW = new bmw(120, "BMW 4.20d", 2016, "Dizel");

        nissan NISSAN = new nissan(100, "NISSAN X-TRAIL", 2020, "Benzin");

        audi AUDI = new audi(150, "AUDI A7",2022,"Benzin");

        mercedes MERCEDES = new mercedes(200, "MERCEDES C63 AMG", 2016, "Dizel" );

        volvo VOLVO = new volvo(125, "VOLVO XC90", 2023, "BENZİN/ELEKTRİK(HİBRİT)");

        System.out.println("-BRO'S RENT A CAR'A HOS GELDİNİZ-");
        System.out.println("ASSAGIDAKİ ARABALARIMIZ YER ALMAKTADIR:");
        System.out.println("1." + BMW.model + "Gunluk :" + BMW.gunlukFiyat + "TL" + "YIL :" + BMW.yil + "YAKIT :" + BMW.yakitTuru + "\n" +
        "2." + NISSAN.model + "Gunluk :" + NISSAN.gunlukFiyat + "TL" + "YIL :" + NISSAN.yil + "YAKIT :" + NISSAN.yakitTuru + "\n" +
        "3." + AUDI.model + "Gunluk :" + AUDI.gunlukFiyat + "TL" + "YIL :" + AUDI.yil + "YAKIT :" + AUDI.yakitTuru + "\n" +
        "4." + MERCEDES.model + "Gunluk :" + MERCEDES.gunlukFiyat + "TL" + "YIL :" + MERCEDES.yil + "YAKIT :" + MERCEDES.yakitTuru + "\n" +
        "5." + VOLVO.model + "Gunluk :" + VOLVO.gunlukFiyat + "TL" + "YIL :" + VOLVO.yil + "YAKIT :" + VOLVO.yakitTuru + "\n");
        System.out.println("SECMEK İSTEDİGİNİZ ARABA'NIN NUMARASINI GİRİNİZ : ");;
        secim = scanner.nextInt();

        switch(secim)
        {
            case 1:
            toplamFiyat = 120;
                System.out.println("Kac gun kiralayacaksiniz : ");
                gun = scanner.nextInt();
                toplamFiyat*=gun;

                System.out.println("EKSTRA OZELLİKLER :");
                System.out.println("1 -> KIS LASTİGİ = 20TL");
                System.out.println("2 -> BEBEK OTOKOLTUGU = 40TL");
                System.out.println("0 ->EKSTRASIZ DEVAM ET");
                secimEk = scanner.nextInt();
                switch(secimEk)
                {
                    case 1:
                        toplamFiyat += 20;
                    break;
                    case 2:
                        toplamFiyat += 40;
                        break;
                }
                break;
            case 2:
                toplamFiyat = 100;
                System.out.println("Kac gun kiralayacasınız : ");
                gun = scanner.nextInt();
                toplamFiyat *= gun;

                System.out.println("EKSTRA OZELLİKLER :");
                System.out.println("1 -> KIS LASTİGİ = 20TL");
                System.out.println("2 -> BEBEK OTOKOLTUGU = 40TL");
                System.out.println("0 ->EKSTRASIZ DEVAM ET");
                secimEk = scanner.nextInt();
                switch (secimEk){
                    case 1:
                        toplamFiyat += 20;
                        break;
                    case 2:
                        toplamFiyat += 40;
                        break;
                }
                break;
            case 3:
                toplamFiyat = 150;
                System.out.println("Kac gun kiralayacasınız : ");
                gun = scanner.nextInt();
                toplamFiyat *= gun;

                System.out.println("EKSTRA OZELLİKLER :");
                System.out.println("1 -> KIS LASTİGİ = 20TL");
                System.out.println("2 -> BEBEK OTOKOLTUGU = 40TL");
                System.out.println("0 ->EKSTRASIZ DEVAM ET");
                secimEk = scanner.nextInt();
                switch (secimEk){
                    case 1:
                        toplamFiyat += 20;
                        break;
                    case 2:
                        toplamFiyat += 40;
                        break;
                }
                break;
            case 4:
                toplamFiyat = 200;
                System.out.println("Kac gun kiralayacasınız : ");
                gun = scanner.nextInt();
                toplamFiyat *= gun;

                System.out.println("EKSTRA OZELLİKLER :");
                System.out.println("1 -> KIS LASTİGİ = 20TL");
                System.out.println("2 -> BEBEK OTOKOLTUGU = 40TL");
                System.out.println("0 ->EKSTRASIZ DEVAM ET");
                secimEk = scanner.nextInt();
                switch (secimEk){
                    case 1:
                        toplamFiyat += 20;
                        break;
                    case 2:
                        toplamFiyat += 40;
                        break;
                }
                break;
            case 5:
                toplamFiyat = 125;
                System.out.println("Kac gun kiralayacasınız : ");
                gun = scanner.nextInt();
                toplamFiyat *= gun;

                System.out.println("EKSTRA OZELLİKLER :");
                System.out.println("1 -> KIS LASTİGİ = 20TL");
                System.out.println("2 -> BEBEK OTOKOLTUGU = 40TL");
                System.out.println("0 ->EKSTRASIZ DEVAM ET");
                secimEk = scanner.nextInt();
                switch (secimEk){
                    case 1:
                        toplamFiyat += 20;
                        break;
                    case 2:
                        toplamFiyat += 40;
                        break;
                }





        }

        System.out.println("TOPLAM BORCUNUZ : " + toplamFiyat);
        System.out.println("BİZİ TERCİH ETTİGİNİZ TESEKKÜRLER:) İYİ GÜNLER DİLERİZ... ");




    }
}
class bmw {

    int gunlukFiyat;
    String model;
    int yil;
    String yakitTuru;

    public bmw(int gunlukFiyat, String model, int yil, String yakitTuru){
        super();
        this.gunlukFiyat = gunlukFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTuru = yakitTuru;

    }
}
class nissan {

    int gunlukFiyat;
    String model;
    int yil;
    String yakitTuru;

    public nissan(int gunlukFiyat, String model, int yil, String yakitTuru){
        super();
        this.gunlukFiyat = gunlukFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTuru = yakitTuru;


    }

}
class audi {
    int gunlukFiyat;
    String model;
    int yil;
    String yakitTuru;

    public audi(int gunlukFiyat, String model, int yil, String yakitTuru){
        super();
        this.gunlukFiyat = gunlukFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTuru = yakitTuru;

    }
}
class mercedes {
    int gunlukFiyat;
    String model;
    int yil;
    String yakitTuru;

    public mercedes(int gunlukFiyat, String model, int yil, String yakitTuru){
        super();
        this.gunlukFiyat = gunlukFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTuru = yakitTuru;

    }
}
class volvo {
    int gunlukFiyat;
    String model;
    int yil;
    String yakitTuru;

    public volvo(int gunlukFiyat, String model, int yil, String yakitTuru){
        super();
        this.gunlukFiyat = gunlukFiyat;
        this.model = model;
        this.yil = yil;
        this.yakitTuru = yakitTuru;

    }
}