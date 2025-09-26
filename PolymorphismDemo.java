 class Sums{
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

 }
 
 
 class PolymorphismDemo {
    public static void main(String[] args) {
        Sums obj = new Sums();
        System.out.println("Sum of 4  and 5 is:"+obj.sum(4,5));
        System.out.println("Sum of 4,6 and 5 is:"+obj.sum(4,5,6));
        System.out.println("Sum of 4.00  and 5.00 is:"+obj.sum(4.00,5.00));
    }
}
