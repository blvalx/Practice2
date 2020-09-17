public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void HumanAge(){
        System.out.println("Возраст собаки " + name + " в человеческом возрасте равен: " + age*7 + " г.");
    }

    @Override
    public String toString() {
        return "Кличка собаки: " + name +
                ", Возраст собаки: " + age;
    }
}
