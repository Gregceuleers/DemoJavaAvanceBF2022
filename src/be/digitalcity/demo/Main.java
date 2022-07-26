package be.digitalcity.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Chien> liste = Arrays.asList(
                new Chien("Titus", 3, Couleur.BLANC),
                new Chien("Tito", 6, Couleur.BEIGE),
                new Chien("Médor", 1, Couleur.NOIR),
                new Chien("Akira", 8, Couleur.BLANC)
        );

        rechercheParNom(liste, "médor");
        rechercheViaCritere(
                liste,
                (chien) -> chien.getName().contains("Tit") && chien.getCouleur().equals(Couleur.BEIGE),
                System.out::println);

    }

    public static void rechercheParNom(List<Chien> data, String name) {
        for(Chien c : data) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
            }
        }
    }

    public static void rechercheViaCritere(List<Chien> data, Predicate<Chien> predicate, Consumer<Chien> consumer) {
        for(Chien c : data) {
            if (predicate.test(c)) {
                consumer.accept(c);
            }
        }
    }
}
