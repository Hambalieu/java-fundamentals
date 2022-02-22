package inheritance;

public class Restaurant {
    private String name;
    private double stars;
    private double price;

   public Restaurant(String name, double stars, double price)
   {
       this.name = name;
       this.stars = stars;
       this.price = price;
   }
   public String toString() {
       return  "Name: " + this.name + " " + " Stars: " + this.stars + " " + " Price: " + this.price ;
   }

}
