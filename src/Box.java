class Box {
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
