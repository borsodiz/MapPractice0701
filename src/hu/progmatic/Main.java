package hu.progmatic;

public class Main {

    public static void main(String[] args) {

        Owner Zita = new Owner("123", "Zita", true);
        Owner Kitti = new Owner("234", "Kitti", true);
        Owner Balazs = new Owner("345", "Balázs", false);
        Owner Ria = new Owner("456", "Ria", true);


        Car car1 = new Car("Toyota", 10, Zita);
        Car car2 = new Car("KIA", 5, Kitti);
        Car car3 = new Car("BMW", 2, Kitti);
        Car car4 = new Car("Nissan", 5, Balazs);
        Car car5 = new Car("Jaugar", 2, Ria);
        Car car6 = new Car("Mini Cooper", 0, Ria);



    }
}
