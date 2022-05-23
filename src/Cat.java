public class Cat extends Pet{
    private String gender;

    public Cat(String name, int age, float weight, float height, String color, String gender) {
        super(name, age, weight, height, color);
        this.gender = gender;
    }

    public Cat(String gender) {
        this.gender = gender;
    }

    public Cat(String name, int age, float weight, float height, String color) {
        super(name, age, weight, height, color);
    }

    public Cat(){

    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

