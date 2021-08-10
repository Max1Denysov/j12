class Shipment extends BoxProp{
    double costs;
    Shipment(Shipment ob){  // clone
        super(ob);
        this.costs = ob.costs;
    }

    Shipment(double w, double h, double d, double m, double c){ // box
        super(w,h,d,m);
        this.costs = c;
    }

    Shipment(){  // empty
        super();
        this.costs = -1;
    }

    Shipment(double lan, double m, double c){ // cube
        super(lan,m);
        this.costs = c;
    }
}