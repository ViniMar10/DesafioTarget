import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        String string;
        System.out.println("Digite a string que deseja inverter:");
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        StringBuilder stringInvertida = new StringBuilder();
        stringInvertida.append("");

        for(int i=string.length()-1;i>=0;i--){
            stringInvertida.append(string.charAt(i));
        }

        string = stringInvertida.toString();
        System.out.println(string);
    }
}
