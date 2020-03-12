import java.util.Scanner;

public class IvestiVarda {
    // parasyti programa, kuri ivedus varda ismestu varda ir suskaiciuotu kiek simboliu yra tame varde

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite varda: ");
        String vardas = sc.nextLine();

        System.out.println("Ivestas vardas:" + vardas);
        vardas.length();
        System.out.println("Raidziu skaicius: " + vardas.length());

    }
}
