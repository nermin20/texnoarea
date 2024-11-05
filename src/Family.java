import java.util.Arrays;

public class Family extends Human {
    private Human mother;
    private  Human father;
    private Human[] children;
    private  Pet pet;

    int pointer = 0;

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    public Family(Human mother, Human father, Human[] children){}

//
//    public Human addChild(Human[] children, String child ){
//        return children[pointer++] = child;
//    }
//
//    public boolean deleteChild(){
//
//        return true
//    }
//
    public int  countFamily(Human[] children){
        return children.length + 2;
    }




}
