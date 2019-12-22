package hello;

public class Fibonachi {
    int seqnumber;
    public static int fib(int seqnumber){
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= seqnumber; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        return n1;

    }
}
