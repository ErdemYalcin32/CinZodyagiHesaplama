import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılınızı girin: ");
        int dogumYili = scanner.nextInt();

        String[] cinZodyagi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int indeks = dogumYili % 12;
        String burc = cinZodyagi[indeks];

        System.out.println("Çin Zodyağı burcunuz: " + burc);

        scanner.close();
    }
}