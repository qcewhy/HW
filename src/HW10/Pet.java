package HW10;

import java.util.Arrays;

public class Pet {
        private String species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String[] habits;

        public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        // Геттери і сеттери для полів

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getTrickLevel() {
            return trickLevel;
        }

        public void setTrickLevel(int trickLevel) {
            this.trickLevel = trickLevel;
        }

        public String[] getHabits() {
            return habits;
        }

        public void setHabits(String[] habits) {
            this.habits = habits;
        }
        public void eat (){
        System.out.println("Я їм!");
    }
    public  void respond (){
        System.out.println("Привіт хазяїн. " + "Я - " + nickname + " Я скучив!");
    }
    public  void foul(){
        System.out.println("Потрібно добре замести сліди....");
    }
    @Override
    public String toString () {
        System.out.println(getSpecies() + "{\n" + "nickname = " + getNickname() + "\n" + "age = " + getAge() + "\n" + "trickLevel = " + Arrays.toString(getHabits()));
        return null;
    }
    public Pet(String species, String nickname,int age){
            this.species = species;
            this.nickname = nickname;
            this.age = age;

    }
    public Pet(){

    }

}
