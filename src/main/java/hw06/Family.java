package hw06;

import java.util.ArrayList;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private Pet pet;

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

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    Family(Human father, Human mother, ArrayList<Human> children){
        this.father = father;
        this.mother = mother;
        this.children = children;
    }
    ArrayList<Human> addChild(Human child){
        children.add(child);
        return children ;
    }
    boolean deleteChild(int index){
        for(int i = 0; i < children.size();i++ ){
            if (index!=i)
                continue;
            children.remove(index);
        }
        return true;
    }

    boolean deleteChild(Human child){
        for(int i = 0; i < children.size();i++ ){
            if(child.equals(children.get(i))) {
                return false;
            }
        }
        return true;
    }
    int countFamily(){
        int counter = 2;
        for (int i = 0; i < children.size(); i ++){
            counter ++;
        }
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Objects.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                " father=" + father.getName() + "" + father.getSurname() +
                ", mother=" + mother.getName() + "" + mother.getSurname() +
                ", children=" + children +
                '}';

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method worked in Family class");
    }
}
