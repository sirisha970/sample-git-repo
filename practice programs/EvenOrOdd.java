class EvenOrOdd{

public void checkNumber(int num){

          if(num % 2==0){
            System.out.println("Even Number");
            }else{
            System.out.println("Odd Number");
            }
}
public static void main(String[] args){

EvenOrOdd eod = new EvenOrOdd();
eod.checkNumber(5);
}

}