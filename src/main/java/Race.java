public class Race {
    static void leManRace(Car[] cars){
        String fastCar ="";
        for (int i=1; i<cars.length; i++){
            if (calculateDistance(cars[i].speed)>calculateDistance(cars[i-1].speed)) {
                fastCar = cars[i].name;
            }
            else{
                fastCar = cars[i-1].name;
            }
        }
        System.out.println("Самая быстрая машина: "+fastCar);
    }


    static int calculateDistance(int speed){
        return speed * 24;
    }
}
