class box{
   private double width,height,depth;
    box(box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;

    }

    box(double w,double h, double d){
        this.width = w ;
        this.height = h ;
        this.depth = d ;
    }

    box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;

    }
    box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth ;
    }
}

class boxweight extends box{
    double weight;
    boxweight(double w,double h, double d,double m){
       super(w,h,d);
       this.weight = m;
    }
    boxweight(boxweight ob){
        super(ob);
        this.weight =ob.weight;
    }
    boxweight(){
        super();
        weight = -1;
    }
    boxweight(double len, double m){
        super(len);
        this.weight = m;
    }
}

class colorBox extends box{
    int color;
    colorBox(double w,double h, double d, int c ){
        super(w,h,d);
        this.color = c ;
    }
}

public class refs {

    public static void main(String []args){
        boxweight mybox1 = new boxweight(10,12,15,25);

        box plainbox = new box();
        plainbox = mybox1;
        double vol;
        vol = plainbox.volume();
        System.out.println("VOLUME = " + vol);
        boxweight mybox2 = new boxweight(10,20,15,30);
        boxweight mybox3 = new boxweight();
        boxweight mycube = new boxweight(200,300);
        boxweight myclone = new boxweight(mybox1);

        System.out.println("VOLUME BOX 1  =  " + mybox1.volume() );
        System.out.println("VOLUME  BOX 2 =  " + mybox2.volume() );
        System.out.println("VOLUME  EMPTY BOX  =  " + mybox3.volume() );
        System.out.println("VOLUME  CUBE =  " + mycube.volume() );
        System.out.println("VOLUME CLONE BOX 1 =  " + myclone.volume() );
    }
}
