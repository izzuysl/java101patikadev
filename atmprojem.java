java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String username,password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner inp = new Scanner(System.in);

        while(right>0){
            System.out.print("kullanıcı adı giriniz:");
            username = inp.nextLine();
            System.out.print("şifre giriniz:");
            password = inp.nextLine();

            if(username.equals("PATİKA")&&password.equals("DEV123")){
                System.out.println("doğru giriş yaptınız.");
                do{

                    System.out.println("1-para yatırma\n" + "2- Para Çekme\n" +  "3- Bakiye sorggulama\n"+  "4- çıkış yap");
                    System.out.println("Lütfen yapacağınız işlemi seçiniz.");
                    select = inp.nextInt();
                    if(select == 1){
                        System.out.println("para miktarı:");
                        int price = inp.nextInt();
                        balance += price;

                    }else if(select== 2){
                        System.out.println("para çekme miktarı");
                        int price = inp.nextInt();
                        if(price>balance){
                            System.out.println("bakiye yetersiz.");
                        }else{
                            balance = balance - price;
                        }
                    }else if(select == 3){
                        System.out.println("bakiyeniz: " + balance);
                    }
                }while(select != 4);
                System.out.println("görüşmek üzere.");
                break;


            }else{
                right --;
                System.out.println("tekrar deneyiniz.");
                System.out.println("kalan hakkınız:"+ right);
            }
        }
    }
}
