public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private int base;
    private int height;

    public Triangle(int sideA,int sideB,int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }

    public int baseHeightArea(){
        return (int) (0.5*base*height);
    }

    public int HeroneArea(){
        int s= (int) (0.5*(sideA+sideB+sideC));
        return (int) Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }

}
