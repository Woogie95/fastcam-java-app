package fastcampus.javaonlinelecture.ch06;

import java.util.ArrayList;
import java.util.List;

class Animal{
    public void  move(){
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal{

    public void move(){
        System.out.println("사람이 두 발로 걷는다.");
    }

    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날아 다닌다.");
    }

    public void flying(){
        System.out.println("독수리가 날개를 피고 날아다닌다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal a : animalList){
            a.move();
        }

    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
