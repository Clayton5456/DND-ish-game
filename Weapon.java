import java.util.*;

public class Weapon extends Item
{


  public Weapon(String name, int price, String dmgDie, String wClass)
  {
    super(name,price,dmgDie,wClass);
    
  }

  @Override
  public int getDamage()
  {
    if(super.getDice()=="d4")
    {
      return Dice.d4();
    }
    else if(super.getDice()=="d6")
    {
      return Dice.d6();
    }
    else if(super.getDice()=="d8")
    {
      return Dice.d8();
    }
    else if(super.getDice()=="d10")
    {
      return Dice.d10();
    }
    else if(super.getDice()=="d12")
    {
      return Dice.d12();
    }
    return Dice.d4();
  }

  public void printWeapon()
  {
    System.out.println("Name: "+this.getName()+"\n"+ "Damage: "+this.getDice()+"\n"+"Price: "+this.getPrice()+"\n"+"Class: "+ this.getWClass()+"\n");

  }



}