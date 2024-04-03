// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //winter, spring, summer, autumn
    // warm jacket, t-shirt, swim suit, rain coat
    var Temperature = 30;
    
    if (Temperature == 5) {
      System.out.println("Wear super warm");
    }
    else if (Temperature <= 15) {
      System.out.println("Warm");
    }
    else if (Temperature <= 30) {
      System.out.println("Normal");
    }
    else if (30 < Temperature) {
      System.out.println("You need cooling");
    }
    else  {
      System.out.println("Error");
    }
