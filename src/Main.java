public class Main {
    public static void main(String[] args) {
        /////////////////////////////////////// Задание №1 ////////////////////////////////////
	    Shape shape = new Shape("Triangle",3);
        System.out.println(shape + "\n");
        /////////////////////////////////////// Задание №2 ////////////////////////////////////
        Book book = new Book("Робинзон Крузо", "Даниэль Дефо",230);
        System.out.println(book + "\n");
        /////////////////////////////////////// Задание №3 ////////////////////////////////////
        Ball ball = new Ball("Футбольный","Красный");
        System.out.println(ball + "\n");
        /////////////////////////////////////// Задание №4 ////////////////////////////////////
        Dog dog = new Dog("Шарик", 3);

        dog.HumanAge();
        System.out.println(dog + "\n");

        Dog dog2 = new Dog("Барбос", 4);
        Dog dog3 = new Dog("Марс", 5);

        DogKennel dogKennel = new DogKennel();

        dogKennel.addDogs(dog);  // добавление собак в питомник
        dogKennel.addDogs(dog2); // добавление собак в питомник
        dogKennel.addDogs(dog3); // добавление собак в питомник

        dogKennel.getDogs(); // вывод собак
    }
}
