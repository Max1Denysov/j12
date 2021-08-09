class Box{
    double width,height,depth;
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
    double weight;

    BoxProp(BoxProp ob,double m){ // Clone
        super(ob);
        this.weight = m;


    }

    BoxProp(double w,double h, double d, double m){ // Box
        super(w,h,d);
        this.weight = m;
    }

    BoxProp(){ // empty
        super();
        weight = -1;

    }




    BoxProp(double lan, double m){
        super(lan);
        this.weight = m;
    }
}



public class hierarhi {
    public static void main(String []args){
        BoxProp mybox = new BoxProp(10,20 , 30,60);
        BoxProp myCube = new BoxProp(50, 25);
        BoxProp myEmpty = new BoxProp();
        BoxProp myClone = new BoxProp(mybox , 12);
        System.out.println("Mybox Volume: " + mybox.volume() + "\nMyCube Volume: "+ myCube.volume());
        System.out.println("MyEmpty Volume: " + myEmpty.volume() + "\nMyClone Volume: "+ myClone.volume());


    }
}
