public class Pet {
    String name;
    int age;
    float weight;
    float height;
    String color;

    public Pet(String name, int age, float weight, float height, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.color = color;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pet() {
    }

    public void sleep(){
        System.out.println("Спокойной ночи! До завтра");
    }

    public void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами!");
    }
    public String say(String aWord){
        String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }
    public void grow(){
        this.age = age+1;
        this.height = ++height;
        this.weight = weight+1;

    }
}
