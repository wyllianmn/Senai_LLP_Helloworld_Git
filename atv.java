import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num,cont=0,soma=0,media;

        System.out.println("digite um numero: ");
        num = leia.nextInt();

        while (num >= 0) {
            soma += num;
            cont=cont+1;
            System.out.println(" digita novamente :");
            num = leia.nextInt();
        }
        media = soma/cont;
            System.out.println("sua media e "+ media);
        
    }
}
