import java.util.Arrays;

class BinaryNString{
    int[] A;
    public BinaryNString(int n){
        A = new int[n];
    }
    public void generate(int n){
        if(n<=0){
            System.out.println(Arrays.toString(A));
            return;
        }
        A[n-1]=0;
        generate(n-1);
        A[n-1]=1;
        generate(n-1);
    }
    public static void main(String args[]){
        System.out.println("All cases for n=1");
        BinaryNString b1 = new BinaryNString(1);
        b1.generate(1);
        System.out.println("All cases for n=2");
        BinaryNString b2 = new BinaryNString(2);
        b2.generate(2);
        System.out.println("All cases for n=3");
        BinaryNString b3 = new BinaryNString(3);
        b3.generate(3);
        
    }
}