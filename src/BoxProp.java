class BoxProp extends Box {
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



