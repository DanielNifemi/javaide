package tdd;

public class TwelveDaysOfChristmas {

    public static void main(String[]  args) {
        for (int day =1; day <= 12; day++) {
          System.out.println("on the " + day);
          switch (day) {
              case 1 -> System.out.println("st");
             case 2 -> System.out.println("nd");
             case 3 -> System.out.println("rd");
             case 4 -> System.out.println("th");
          }
          System.out.println("day of christmas my true love gave to meee");

          switch (day){
              case 12: System.out.println("twelve drummers drumming");
              case 11: System.out.println("Eleven pipers piping");
              case 10: System.out.println("Ten lords are leaping!!!");
              case 9: System.out.println("Nine ladies are dancing");
              case 8: System.out.println("Eight maids are milking $$");
              case 7: System.out.println("Seven swans a swimming");
              case 6: System.out.println("Six geese a laying");
              case 5: System.out.println("Five golden rings !!! $$");
              case 4: System.out.println("Four calling birds");
              case 3: System.out.println("Three french hens");
              case 2: System.out.println("Two turtle doves , and");
              default: System.out.println("A partridge in a pear tree.");
          }
          System.out.println();
        }
    }
}
