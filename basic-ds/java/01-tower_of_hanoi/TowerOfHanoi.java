class TowerOfHanoi{
    public void calculate(int n, char fromPeg, char toPeg, char auxPeg){
        if(n==1){
            System.out.println("Move disk from "+ fromPeg + " to " + toPeg);
            return;
        }
        calculate(n-1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk from "+ fromPeg + " to " + toPeg);
        calculate(n-1, auxPeg, toPeg, fromPeg);
    }
    public static void main(String args[]){
        TowerOfHanoi t = new TowerOfHanoi();
        System.out.println("Executing for 1 disk");
        t.calculate(1,'A','B','C');
        System.out.println("Executing for 2 disks");
        t.calculate(2,'A','B','C');
        System.out.println("Executing for 3 disks");
        t.calculate(3,'A','B','C');
    }
}