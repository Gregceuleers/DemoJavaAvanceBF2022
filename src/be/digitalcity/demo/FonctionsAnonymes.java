package be.digitalcity.demo;

public class FonctionsAnonymes {

    public static void main(String[] args) {
        Chien titus = new Chien("Titus");
        Deplacement<Chien> fnDeplacement = (x) -> System.out.println(x);
        fnDeplacement.seDeplacer(titus);

    }

}
