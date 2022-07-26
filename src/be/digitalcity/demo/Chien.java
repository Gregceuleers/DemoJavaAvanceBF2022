package be.digitalcity.demo;

import java.util.Objects;

public class Chien {

    private String name;

    private int age;

    private Couleur couleur;



    public Chien(String name) {
        this.name = name;
    }

    public Chien(String name, int age, Couleur couleur) {
        this.name = name;
        this.age = age;
        this.couleur = couleur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chien chien = (Chien) o;
        return age == chien.age && Objects.equals(name, chien.name) && couleur == chien.couleur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, couleur);
    }

    @Override
    public String toString() {
        return "Chien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", couleur=" + couleur +
                '}';
    }
}
