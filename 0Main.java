import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Character> characters =new ArrayList<Character>();
    Character saul= new Character("Saul Bomba", 54, 54, "clayton");
    Character mord=new Character("Mordell Scrounge", 54,6, "clayton");

    saul.hit(mord);
    System.out.println(mord.getHealth());
    mord.hit(saul);
    System.out.println(saul.getHealth());

    System.out.println(Dice.d4());
    System.out.println(Dice.d6());
    System.out.println(Dice.d8());
    System.out.println(Dice.d10());
    System.out.println(Dice.d12());
    System.out.println(Dice.d20());


  }
}