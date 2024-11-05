import java.util.Arrays;
import java.util.Random;

public class Pet {
    private String species;
    private String nicname ;
    private int age;
    private int tricklevel;
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNicname() {
        return nicname;
    }

    public void setNicname(String nicname) {
        this.nicname = nicname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public Pet(){}

    public Pet(String species, String nickname) {
        this.species = species;
        this.nicname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nicname = nickname;
        this.age = age;
        this.tricklevel = trickLevel;
        this.habits = habits;
    }

    public  void eat(){
        System.out.println(" I am eating ");
    }

    public  void respond(){
        System.out.println("Hello, owner. I am - " + nicname + ". I miss you!");

    }
    public  void foul(){
        System.out.println(" I need to cover it up ");
    }

    public String toString() {
        return species + "{nickname='" + nicname + "', age=" + age + ", trickLevel=" + tricklevel + ", habits=" + Arrays.toString(habits) + "}";
    }






}





