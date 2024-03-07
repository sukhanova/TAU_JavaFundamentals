package chapter10;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal misha = new Dog();
        misha.makeSound();

        misha = new Cat();
        misha.makeSound();

        //Type Casting
        //Casting is the act of converting an object’s type into a different type.
        ((Cat) misha).scratch();
        feed(misha);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }

        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
