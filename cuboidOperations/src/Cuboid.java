public class Cuboid {

    private int length,breadth,height;

    public Cuboid(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public int totalArea(){
        return 2*((length*breadth)+(breadth*height)+(length*height));
    }

    public int volume(){
        return length*breadth*height;
    }


}
