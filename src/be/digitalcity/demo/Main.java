package be.digitalcity.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Chien> liste = Arrays.asList(
                new Chien("Titus", 3, Couleur.BLANC),
                new Chien("Tito", 6, Couleur.BEIGE),
                new Chien("Médor", 1, Couleur.NOIR),
                new Chien("Akira", 8, Couleur.BLANC)
        );

//        rechercheParNom(liste, "médor");
//        rechercheViaCritere(
//                liste,
//                (chien) -> chien.getName().contains("Tit") && chien.getCouleur().equals(Couleur.BEIGE),
//                System.out::println);

/*        Via les stream<Integer>, calculer la somme des carrés des nombres impairs de la liste suivante
            {1,2,3,4,5,6,7,8,9}
* */
        Optional<Double> result = Stream.iterate(1D, n -> n + 1)
                        .limit(999)
                        .filter(n -> n % 2 != 0)
                        .map(n ->  n * n)
                        .peek(System.out::println)
                        .reduce((a,b) -> a + b);

        result.ifPresent(System.out::println);

    }

//    private static boolean findByName

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
