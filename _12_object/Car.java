package _12_object;

public class Car {
    int modelYear;
    String modelName;

    public void run(){
        System.out.println("My car: "+modelName+" is running");
    }

    public Car(int modelYear, String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    public static void main(String[] args) {
        Car myCar = new Car(1986, "BMW");
        System.out.println(myCar.modelYear + " " + myCar.modelName);

        Car myCar_2 = new Car(1999, "Toyota");
        System.out.println(myCar_2.modelYear + " " + myCar_2.modelName);
    }
}
