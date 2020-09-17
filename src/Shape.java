public class Shape {
    private String name;
    private int numberOfSides;




    public Shape(String name, int numberOfSides) {
        this.name = name;
        this.numberOfSides = numberOfSides;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
        return "Название фигуры: " + name +
                ", Количество сторон = " + numberOfSides;
    }
}

