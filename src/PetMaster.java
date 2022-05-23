import java.util.Arrays;
import java.util.Random;

public class PetMaster {
    public static void main(String[] args) {
   /*     String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик!! Чирик!!");
        System.out.println(petReaction);
        myPet.sleep();
        Fish myFish = new Fish();
        myFish.dive(99);
        myFish.dive(101);
        myFish.sleep();
        myFish.say("Hello");
        Pet myDog = new Pet();
        myDog.setAge(9);
        myDog.setWeight(1.5f);
        myDog.setHeight(0.9f);
        myDog.setColor("Black");
        System.out.println(myDog);
        Pet myElephant = new Pet("Elephant Valera",1,1.4f,1.5f,"White");
        System.out.println(myElephant);
        myElephant.say("Hello World");
        myElephant.grow();
        System.out.println(myElephant);
        myElephant.age = 3;
        System.out.println(myElephant);

        Human valera = new Human();
        valera.setName("Valera");
        valera.setAge(25);
        valera.setGender("Male");
        valera.setHeight(190.4);
        valera.setWeight(101.1);
        System.out.println(valera);

        Cat valerchik = new Cat();
        valerchik.setName("Kotik");
       //valerchik.setAge(5);
        valerchik.setWeight(0.4f);
        valerchik.setColor("Yellow");
        valerchik.setHeight(0.5f);
        valerchik.setGender("Female");
        System.out.println(valerchik);*/

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <= 4; i++) {
            System.out.println(numbers[i]);
        }
        double avg = 0;
        //avg = (numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4])/ 5;
        System.out.println(avg);

        for (int i = 0; i < 5; i++) {
            System.out.println(avg += numbers[i]);
        }
        System.out.println(avg / 5);

        // 1) створити Автобус(з своїми параметрами і вивести його).
        // 2) зробити масив із 10 елементів, 123456789, через цикл for зобити факторіал цього масиву.

        Bus myBus = new Bus();
        myBus.setBusDirection("Lviv");
        myBus.setBusOwner("Sviatoslav");
        myBus.setBusSeats(40);
        myBus.setNumberOfTheBus(45);
        myBus.setPrice(30.5);
        System.out.println(myBus);

        int[] fNumbers = new int[9];
        fNumbers[0] = 1;
        fNumbers[1] = 2;
        fNumbers[2] = 3;
        fNumbers[3] = 4;
        fNumbers[4] = 5;
        fNumbers[5] = 6;
        fNumbers[6] = 7;
        fNumbers[7] = 8;
        fNumbers[8] = 9;

        System.out.println(Arrays.toString(fNumbers));

        int factorial = 1;
        for (int i = 0; i < fNumbers.length; i++) {
            System.out.println(fNumbers[i]);
            factorial = factorial * fNumbers[i];
        }
        System.out.println(factorial);


        int[] array_1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array_1[i] = random.nextInt(100);
        }
        for (int i = 0; i < array_1.length; i++) {
            System.out.print(array_1[i]);
            checkDivision(array_1[i]);
            System.out.println();
        }



        int num = 3;
        boolean isEven = isEven(num);
        System.out.println(isEven);
        System.out.println(isEven(2));


    }

    public static void checkDivision(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(" Ой Лишенько)");

        }
        if (num % 3 == 0) {
            System.out.println(" Ділиться на 3!");
        }
        if (num % 5 == 0) {
            System.out.println(" Ділиться на 5!");
        }

    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}


// Сворити масив на 10 елементів, рандомно його заповнити, і відсортувати(програмно) в порядку зростання.

