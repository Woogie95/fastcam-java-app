package fastcampus.javaonlinelecture.ch08;

import java.util.ArrayList;
import java.util.List;

class Animal {
    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human extends Animal {

    public void move() {
        System.out.println("사람이 두 발로 걷는다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닌다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 피고 날아다닌다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal a : animalList) {
            a.move();
        }
        test.testDownCasting(animalList);
    }

    public void testDownCasting(List<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("No");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
