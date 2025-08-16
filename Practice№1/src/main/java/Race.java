public class Race {

    static void leManRace(Car[] cars){
        int hours = 24;
        String fastCar ="";
        for (int i=1; i<cars.length; i++) {
            if (calculateDistance(cars[i].speed, hours) > calculateDistance(cars[i - 1].speed, hours)) {
                fastCar = cars[i].name;
            } else {
                fastCar = cars[i - 1].name;
            }
        }
        System.out.println("Самая быстрая машина: "+fastCar);
    }



    static int calculateDistance(int speed,int hours){
        return speed * hours;
    }
}

