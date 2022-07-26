package be.digitalcity.demo;

import java.util.Objects;

public class Chien {
    private String name;

    public Chien(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chien chien = (Chien) o;
        return Objects.equals(name, chien.name);
    }

    @Override
    public String toString() {
        return "Chien{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);


    }
}
