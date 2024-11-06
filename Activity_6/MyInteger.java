package Aanand_n01712678.Activity_6;

/*public class MyInteger {

   private int value;
   public MyInteger(){
   }
   public MyInteger(int value){
       this.value=value;
   }

   private double getValue(){
       return this.value;
   }

   private boolean isEven(){
       return false;//will write logic
   }

   private boolean isOdd(){
       return false;
   }

   private boolean isPrime(){
       return false;
   }

   static boolean isPrime(int value){
       for(int i=2; i<value;i++){
           if(value%i==2) return false;
       }
       return true;
   }
}*/
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int n) {
        return this.value == n;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.value;
    }

    public static void main(String[] args) {
        MyInteger m1 = new MyInteger(1);
        MyInteger m2 = new MyInteger(2);
        System.out.println("Value of M1 : "+m1.getValue());
        System.out.println("Value of M2 : "+m2.getValue());
        System.out.println("Is M1 even "+ m1.isEven());
        System.out.println("Is M1 odd "+m1.isOdd());
        System.out.println("Is M1 equals "+m1.equals(m2));
    }
}