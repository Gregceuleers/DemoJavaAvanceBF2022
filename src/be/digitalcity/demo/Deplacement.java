package be.digitalcity.demo;

@FunctionalInterface
public interface Deplacement<T> {
    void seDeplacer(T vehicule);
}
