class paramet{
    double width,height,depth;
    paramet(paramet ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    paramet(int ... par){
        width = par[0];
        height = par[1];
        depth = par[2];
    }

    paramet(){
        width = -1;
        height = -1;
        depth = -1;

    }
    paramet(double len){
        width = height = depth = len;
    }
    double volume(){
        return width * height * depth ;
    }
}

class piped extends paramet{
    double weight;
    piped(int... per){
        width = per[0];
        height = per[1];
        depth = per[2];
        weight = per[3];
    }
}



public class Box {

    public static void main(String []args){
        piped mybox1 = new piped(10,12,15,25);
        piped mybox2 = new piped(2,3,4,5);

        System.out.println("mybox1 volume = " + mybox1.volume() + "\nmybox2 volume = " + mybox2.volume());
        System.out.println("mybox1 weight = "+ mybox1.weight + "\nmybox2 weight = " + mybox2.weight);

    }
}
