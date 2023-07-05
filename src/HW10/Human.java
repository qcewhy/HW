package HW10;

import java.util.ArrayList;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iqLevel;
    private Pet pet;
    private String mother;
    private String father;
    private ArrayList<ArrayList<String>> schedule;
    private Family family;
    public Human(String name, String surname, int yearOfBirth, int iqLevel, Pet pet, String mother, String father, String[] children) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
    public ArrayList<ArrayList<String>> getChildren () {
        return schedule;
    }

    public void setChildren() {
        this.schedule = schedule;
    }
    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet() {
        String trickLevelDescription = (pet.getTrickLevel() > 50) ? "дуже хитра" : "майже не хитра";
        System.out.println("У мене є " + pet.getSpecies() + ", їй " + pet.getAge() + " років, вона " + trickLevelDescription + ".");
    }
    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
