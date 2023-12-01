import java.util.*;


class twodfigure{
    
    
    public int CALC_AREA(){
        return 0;
    }
}
class rectang extends twodfigure{
    int length,breadth;
    public rectang(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int CALC_AREA(int length,int breadth){
        int area = length * breadth;
        System.out.println(" Area is : "+area);
        return area;
    }
}
class tri extends twodfigure{
    int a,b,c;
    public tri(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double CALC_AREA(int a,int b,int c){
        int per = (a+b+c);
        double s = per/2;
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(" Area is : "+area);

        return area;
    }
}
class twod{
    public static void main(String args[]){
        System.out.println("1.RECTANGLE \n 2.TRIANGLE \n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            int l,b;
            l=20;b=5;
            rectang r=new rectang(l,b);
            double ar;
            ar=r.CALC_AREA(l,b);
        }
        else if(a==2){
            int p,q,r;
            p=5;q=9;r=6;
            tri rk=new tri(p,q,r);
            double cd;
            cd=rk.CALC_AREA(p,q,r);
        }
        else{
            System.out.println("enter valid choice");
        }
    }
}
