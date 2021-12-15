import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesafe,yas,yolculukTip;
        double tutar;
        System.out.print("mesafeyi km turunden giriniz : ");
        mesafe = scanner.nextInt();
        System.out.print("yasinizi giriniz");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTip = scanner.nextInt();
        if (mesafe>0 && yas>0 && yolculukTip==1 || yolculukTip==2){
            tutar = mesafe*0.10;
            switch (yolculukTip){
                case 1:
                    if (yas<12){
                        tutar-= tutar*0.50;
                    }
                    else if (yas>=12 && yas<25){
                        tutar -= tutar*0.10;
                    }
                    else if (yas>65){
                        tutar -= tutar*0.30;
                    }
                    break;
                case 2:
                    tutar*=2;
                    tutar -= (tutar*0.20);
                    if (yas<12){
                        tutar-= tutar*0.50;
                    }
                    else if (yas>=12 && yas<25){
                        tutar -=tutar*0.10;
                    }
                    else if (yas>65){
                        tutar -= tutar*0.30;
                    }
                    break;
                default:
            }
            System.out.println(tutar);

        }
        else {
            System.out.println("hatali giris yaptiniz");
        }
    }
}
