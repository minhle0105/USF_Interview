package main;

import java.util.ArrayList;

public class Movie {
    private String name;
    private ArrayList<String> castMemebers;

    public Movie(String name) {
        this.name = name;
        castMemebers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addCastMember(String nameOfActor) {
        castMemebers.add(nameOfActor);
    }

    public ArrayList<String> getCastMemebers() {
        return (ArrayList<String>) castMemebers.clone();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Movie name: " + name + ". List of cast members ");
        for (int i = 0; i < castMemebers.size(); i++) {
            result.append(castMemebers.get(i)).append(", ");
        }
        return result.toString();
    }
}
