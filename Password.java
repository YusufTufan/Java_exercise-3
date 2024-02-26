import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1. Şifreleme");
        System.out.println("2. Degiştirlmiş şifreleme");

        int secenek = scanner.nextInt();

        if(secenek==1){
        System.out.println("Lütfen şifrenizi giriniz:");
        int Password = scanner.nextInt();

        int basamak_1 = Password/1000 ;
        int basamak_2 = (Password%1000)/100 ;
        int basamak_3 = (Password%100)/10 ;
        int basamak_4 = (Password%10);

        basamak_1 = (basamak_1+7)%10;
        basamak_2 = (basamak_2+7)%10;
        basamak_3 = (basamak_3+7)%10;
        basamak_4 = (basamak_4+7)%10;

        int gecici1;
        gecici1 = basamak_1;
        basamak_1 = basamak_3;
        basamak_3 = gecici1;
        int gecici2;
        gecici2 = basamak_2;
        basamak_2 = basamak_4;
        basamak_4 = gecici2;

        System.out.println("ŞİFRELENMİŞ SAYI: "+basamak_1+""+basamak_2+""+basamak_3+""+basamak_4);

    }else if(secenek==2){

        System.out.println("Lütfen değiştirilmiş şifrenizi giriniz:");
        int encrypted_password = scanner.nextInt();

        int encrypted_basamak_1 = encrypted_password/1000 ;
        int encrypted_basamak_2 = (encrypted_password%1000)/100 ;
        int encrypted_basamak_3 = (encrypted_password%100)/10 ;
        int encrypted_basamak_4 = (encrypted_password%10);

        int gecici3;
        gecici3 = encrypted_basamak_1;
        encrypted_basamak_1 = encrypted_basamak_3;
        encrypted_basamak_3 = gecici3;

        int gecici4;
        gecici4 = encrypted_basamak_2;
        encrypted_basamak_2 = encrypted_basamak_4;
        encrypted_basamak_4 = gecici4;

        encrypted_basamak_1 = (encrypted_basamak_1 +3)%10;
        encrypted_basamak_2 = (encrypted_basamak_2 +3)%10;
        encrypted_basamak_3 = (encrypted_basamak_3 +3)%10;
        encrypted_basamak_4 = (encrypted_basamak_4 +3)%10;

        System.out.println("ŞİFRE HALİNE DÖNEN SAYI: "+encrypted_basamak_1+""+encrypted_basamak_2+""+encrypted_basamak_3+""+encrypted_basamak_4);
    }else{
        System.out.println("Geçersiz seçenek programdan çıkılıyor");
    }
    scanner.close();
    }
}