import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = sc.nextLine();

        count = contadorA(input);

        if (count > 0) {
            System.out.println("A letra 'a' (ou 'A') aparece " + count + " veze(s) nessa String.");
        } else {
            System.out.println("A letra 'a' (ou 'A') não aparece na string.");
        }
    }

    public static int contadorA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}