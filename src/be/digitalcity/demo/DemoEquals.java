package be.digitalcity.demo;

public class DemoEquals {

    public static void main(String[] args) {
        Chien a = new Chien("Titus");
        Chien b = new Chien("Titus");

        System.out.println(a.equals(b));

    }
}
