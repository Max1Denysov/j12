class Box{
   private double width,height,depth;
    Box(double w, double h, double d){ // Constructor for Box
        this.width = w;
        this.height = h;
        this.depth = d;

    }
    Box(double w, double h){ // Constructor for Square
        this.width = w;
        this.height = h;
    }

    Box(Box ob){ // Constructor for Clone
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    Box(){  // Empty constructor
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }
    Box(double lan){ //Constructor for Cube
        width = height = depth = lan;
    }

    double volume(){
        return width * height * depth ;
    }
}

class BoxProp extends  Box{
    public double weight;

    BoxProp(BoxProp ob){ // Clone
        super(ob);
        weight = ob.weight;



    }

    BoxProp(double w,double h, double d, double m){ // Box
        super(w,h,d);
        this.weight = m;
    }

    BoxProp(){ // empty
        super();
        weight = -1;

    }




    BoxProp(double lan, double m){ // cube
        super(lan);
        this.weight = m;
    }
}
class shipment extends BoxProp{
    double costs;
    shipment(shipment ob){  // clone
        super(ob);
        this.costs = ob.costs;
    }

    shipment(double w, double h, double d, double m, double c){ // box
        super(w,h,d,m);
        this.costs = c;
    }

    shipment(){  // empty
        super();
        this.costs = -1;
    }

    shipment(double lan, double m, double c){ // cube
        super(lan,m);
        this.costs = c;
    }
}



public class hierarhi {
    public static void main(String []args){
        BoxProp mybox = new BoxProp(10,20 , 30,60);
        BoxProp myCube = new BoxProp(50, 25);
        BoxProp myEmpty = new BoxProp();
        BoxProp myClone = new BoxProp(mybox);

        shipment mybox1 = new shipment(10,20 , 30,60,12);
        shipment myCube1 = new shipment(50, 25,80);
        shipment myEmpty1 = new shipment();
        shipment myClone1= new shipment(mybox1);

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
