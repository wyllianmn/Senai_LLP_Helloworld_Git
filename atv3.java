import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num,maior=0,menor=0;

        System.out.println("digite um numero: ");
        num = leia.nextInt();

        maior = num;
        menor = num;

        while (num > 0) {

            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
            System.out.println("digite novamente: ");
            num = leia.nextInt();
        }
        
            System.out.println("seu maior numero e "+ maior+" seu menor numero e "+ menor);
        }
    }



