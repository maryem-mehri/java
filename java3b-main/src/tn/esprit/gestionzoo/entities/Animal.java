package tn.esprit.gestionzoo.entities;

public class Animal {


    String family;
    String name;
    private int age;
    boolean isMammal;


    public Animal() {

    }
    public Animal(int age){
        setAge(age);
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        if(age>=0){
            this.age=age;
        }else{
            System.out.println("l'age de l'animal ne peut pas étre négatif");
        }
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
