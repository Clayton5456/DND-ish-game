import java.util.*;
public class Character
{
  /*This class is the character by which the player   
   * progresses through the game 
   * This current build has a name, hp, an attack, and an * alive. 
   * It has getter methods for each of these variables, 
   * and both methods to hit and to get hurt.
   * Currently plan to add an inventory of maybe 25 items, * a method to print out the inventory, and maybe I'll 
   * try to make a method to make invnetory larger 
   * Also money, need to add that
   */

  private int hp;
  private int atk;
  private String name;
  private boolean alive=true;
  private String creator;
  private Weapon weapon;
  private int gold;
  ArrayList<Item> inventory=new ArrayList<Item>();
  
  public Character(String name, int health, int attack, String create)
  {
    this.name=name;
    hp=health;
    atk=attack;
    creator=create;
  }

  public int disadvantage()
  {
    int d1=Dice.d20();
    System.out.println("First roll: " +d1+"\n");
    int d2= Dice.d20();
    System.out.println("Second roll: " +d2+"\n");
    Thread.sleep(2000);
    if(d1>=d2)
    {
      System.out.println("Advantage: "+ d2+"\n");
      return d2;
    }
    System.out.println("Advantage: "+ d1+"\n");
    return d1;
  }

  public int advantage()
  {
    
    int d1=Dice.d20();
    System.out.println("First roll: " +d1+"\n");
    int d2= Dice.d20();
    System.out.println("Second roll: " +d2+"\n");
    Thread.sleep(2000);
    if(d1>=d2)
    {
      System.out.println("Advantage: "+ d1+"\n");
      return d1;
    }
    System.out.println("Advantage: "+ d2+"\n");
    return d2;
  }

  //Returns health of the character 
  public String getHealth()
  {
    return this.getName()+": "+ hp;
  }

  //returns character name
  public String getName()
  {
    return name;
  }

  //Returns the attack of the character
  public int getAttack()
  {
    return atk;
  }

  public String getCreator()
  {
    return creator;
  }

  public void setCreator(String creatorr)
  {
    creator=creatorr;
  }

  public Weapon getWeapon()
  {
    return weapon;
  }

  //States if the character is alive or not
  public boolean isAlive()
  {
    return alive;
  }

  /*This is the method by which you take damage
   *I decided it'd be easier to make a whole
   * method to do this, because then I can say who hit
   * who. And fun things like that
   * Precondition: You have a character that has taken   
   * damage
   * Postcondition: Your character's health is decremented * by the amount of damage taken 
   * This is also the method that triggers death.
   */  
  public void hurt(String atker, int damage)
  {
    System.out.println(atker+" hits "+name+" for "+damage+" health!");
    hp-=damage;
    if(hp<=0)
    {
      this.death();
    }
  }
  /*This is the method by which your character deals damage
   * It's not incredibly complicated, because it just  
   * triggers the hurt method
   * Precondition: You have a character who is alive and 
   * your target is alive.
   * Postcondition: Your target gets hurt
   */


  public void hit(Character target)
  {
    if(alive&&target.isAlive())
    {
      target.hurt(name, atk);
    }
  }
  //This is the method where your character dies
  //I might need to add some more conditions so that when 
  //you're dead you can't do much.
  public void death()
  {
    alive=false;
    System.out.println(name +" has died!");
  }

  //Returns the names and health and attack of your character
  public String toString()
  {
    return name + ", hp: "+hp+", atk: "+ atk;
  }

  //Adds an item yo your inventory
  public void getItem(Item item)
  {
    inventory.add(item);
  }

  //Buys an item, if you have enough gold to buy it
  public void buyItem(Item item)
  {
    if(gold>=item.getPrice())
    {
      gold-=item.getPrice();
      inventory.add(item);
    }
  }

  public void equip(Weapon equip)
  {
    for(int i=0;i<=inventory.size();i++)
    {
      if(equip.getName()==inventory.get(i).getName())
      {
        weapon=equip;
        System.out.println(""+ weapon.getName() +" equipped.");
      }
      else {
        System.out.println("Weapon Not found, Try again.");
      }
    }
  }
  
}