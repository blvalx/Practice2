public class DogKennel {
    // Создание класса тестера под названием ПитомникСобак, реализует массив собак и основной метод этого класса
    //
    //позволяет добавить в него несколько объектов собаки.

        private Dog[] dogs = new Dog[10];


        private int k = 0;
        public void addDogs(Dog dog) {
            dogs[k] = dog;
            k++;
        }

        public void getDogs(){
            System.out.println("Собаки в питомнике:");
            for(Dog a: dogs) {
                if (a != null)
                    System.out.println(a);
            }
        }

    }


