public class Ball {
    private String typeOfBall;
    private String color;

    public Ball(String typeOfBall, String color) {
        this.typeOfBall = typeOfBall;
        this.color = color;
    }

    public String getTypeOfBall() {
        return typeOfBall;
    }

    public void setTypeOfBall(String typeOfBall) {
        this.typeOfBall = typeOfBall;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Тип мяча: " + typeOfBall +
                ", Цвет мяча: " + color;
    }
}
