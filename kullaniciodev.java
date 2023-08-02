package kullanicigiris;

import java.util.Scanner;


public class kullaniciodev {
    public static void main(String[] args) {
        String password, userName, newPass;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz: ");
        userName = scan.nextLine();

        System.out.println("Şifreniz: ");
        password = scan.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız! ");
        } else {
            System.out.println("Girdiğiniz  bilgiler yanlış! ");
        }
        System.out.println("Şifrenizi sıfırlamak ister misiniz ? Evetse 1'e basın ");
        int select = scan.nextInt();

        if (select == 1)
        {
            System.out.print("Yeni şifreniz eskisi ile aynı olmamalıdır! ");
            System.out.print("Yeni şifrenizi giriniz: ");
            newPass = scan.next();
            if (newPass.equals("java123")) {
                System.out.print("şifre oluşturulamadı,lütfen başka şifre giriniz! ");
            } else {
                System.out.print("şifre oluşturuldu");
            }

        }
    }
}