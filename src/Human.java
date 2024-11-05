import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(){

    }

    public Human  (String name, String surname, int year ){
        this.name = name;
        this.surname = surname ;
        this.year = year;
    }

    public Human  (String name, String surname, int year, Human father, Human mother ){
        this.name = name;
        this.surname = surname ;
        this.year = year;
        this.father = father;
        this.mother = mother;

    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human father , Human mother, String [][] schedule ){
        this.name= name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }
//
//    public void greetPet(){
//        System.out.println("Hello, " +  pet.nicname);
//    }
//    public void describePet(){
//        String sly = (pet.tricklevel > 50)? "very sly" : "almost not sly";
//        System.out.println("I have a " + pet.species + " hi is age "+
//                pet.age  + " years old, he is " + sly );
//    }
////
//    public boolean feedPet(boolean istimeforfeeding){
//        if(istimeforfeeding){
//            System.out.println("Hm ... I will feed "+ name + "'s " + pet.species);
//            return true;
//        }else{
//            Random random = new Random();
//            int randomnumber = random.nextInt(100);
//            if(pet.tricklevel> randomnumber){
//                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
//                return  true;
//            }else{
//                System.out.println("I think " + pet.nicname + " is not hungry.");
//                return  false;
//            }
//        }
//    }

    public String toString(){
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "unknown") +
                ", father=" + (father != null ? father.name + " " + father.surname : "unknown") +
                ", pet=" + (pet != null ? pet.toString() : "no pet") + "}";
    }

}









