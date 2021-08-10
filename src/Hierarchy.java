
public class Hierarchy {
    public static void main(String []args){
        BoxProp mybox = new BoxProp(10,20 , 30,60);
        BoxProp myCube = new BoxProp(50, 25);
        BoxProp myEmpty = new BoxProp();
        BoxProp myClone = new BoxProp(mybox);

        Shipment mybox1 = new Shipment(10,20 , 30,60,12);
        Shipment myCube1 = new Shipment(50, 25,80);
        Shipment myEmpty1 = new Shipment();
        Shipment myClone1= new Shipment(mybox1);

        System.out.println("Mybox Volume: " + mybox.volume() + "\nMyCube Volume: "+ myCube.volume());
        System.out.println("MyEmpty Volume: " + myEmpty.volume() + "\nMyClone Volume: "+ myClone.volume());
        System.out.println("Mybox Weight: " + mybox.weight + "\nMyCube Weight: "+ myCube.weight);
        System.out.println("MyEmpty Weight: " + myEmpty.weight + "\nMyClone Weight: "+ myClone.weight);

        System.out.println("Mybox1 Volume: " + mybox1.volume() + "\nMyCube1 Volume: "+ myCube1.volume());
        System.out.println("MyEmpty1 Volume: " + myEmpty1.volume() + "\nMyClone1 Volume: "+ myClone1.volume());
        System.out.println("Mybox1 Weight: " + mybox1.weight + "\nMyCube1 Weight: "+ myCube1.weight);
        System.out.println("MyEmpty1 weight: " + myEmpty1.weight + "\nMyClone1 weight: "+ myClone1.weight);
        System.out.println("Mybox1 costs: " + mybox1.costs + "\nMyCube1 costs: "+ myCube1.costs);
        System.out.println("MyEmpty1 costs: " + myEmpty1.costs + "\nMyClone1 costs: "+ myClone1.costs);




    }
}
