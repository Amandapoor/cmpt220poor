
//class Animal which implements Comparable and Cloneable
abstract class Animal implements Comparable<Animal>, Cloneable{
   private double weight;// weight variable to store the weight

   //getter method to get the weight
   public double getWeight() {
       return weight;
   }

   //getter method to set the weight
   public void setWeight(double weight) {
       this.weight = weight;
   }

     /** Return animal sound */
  public abstract String sound();
 
  //the overridden compareTo method that compares the current instance and a parameter instance and return 0,1,or -1
  //the sorting on these objects depends on these values for sorting
  @Override 
  public int compareTo(Animal a){  
        if(weight == a.weight)  
                return 0;  
        else if(weight > a.weight)  
                return 1;  
        else  
                return -1;  
  }    
  
  //overridden clone method
  //the exception is caught in the method itself.
  @Override
  public Object clone() { 
    Object clonedObject = null;
        try {
                clonedObject = super.clone();  
        }
        catch(CloneNotSupportedException e) {
                System.out.println(e.toString());
        }
        return clonedObject;
  }    
}

class Chicken extends Animal {
  @Override
  public String sound() {
    return "Chicken: cock-a-doodle-doo";
  }
}

class Tiger extends Animal {
  @Override
  public String sound() {
    return "Tiger: RROOAARR";
  }
}
