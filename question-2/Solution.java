public class Bottle
  {
    private double capacity;
    private double amount;
public Bottle (double c){
  capacity=c*0.25;
  amount= c;
  }
     public double updateAmount(double r){
       amount-=r
         if (amount<capacity){
          amount=capacity
         }
       return amount;
     }
  }
