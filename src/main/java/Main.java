import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numberCars=3;

        Car[] cars = new Car[numberCars];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Введите название машины №" + (i + 1) + ":");
            String nameCar = checkCarName();
            System.out.println("Введите скорость машины №" + (i + 1) + ":");
            int speedCar = checkCarSpeed();
            cars[i] = new Car(nameCar, speedCar);
        }

        Race.leManRace(cars);
    }



    static String checkCarName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            name = scanner.nextLine();
            if (!(name.trim().isEmpty())) {
                return name;
            } else {
                System.out.println("Пустая строка!");
            }
        }
    }


    public static int checkCarSpeed() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int speed = scanner.nextInt();
                if ((0 < speed) && (speed <= 250)) {
                    return speed;

                } else {
                    System.out.println("Неправильная скорость!");
                }
            } else {
                System.out.println("Введите целое число:");
                scanner.next();
            }
        }
    }


}
