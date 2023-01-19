import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        yil =input.nextInt();
        if (yil %100 ==0){
            if (yil %400 ==0){
                System.out.println(yil  +"Artık Bir Yıldır. " );
            }else {
                System.out.println(yil + "Artık Bir Yıl Değildir" );
            }
        }else if (yil %4 ==0){
            System.out.println(yil +"Artık Bir Yıldır." );
        }else {
            System.out.println(yil +  "Artık Bir Yıl Değildir !" );
        }
    }
}


