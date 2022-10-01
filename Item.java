public class Item
{

  private String name;
  private int price;
  private String dmgDie;
  private String weaponClass;

  public Item(String name, int price, String dmgDie, String wClass)
  {
    this.name=name;
    this.price=price;
    dmgDie="d4";
    weaponClass="improvised";
  }

  public void setName(String name)
  {
    this.name=name;
  }

  public String getName()
  {
    return name;
  }

  public void setPrice(int price)
  {
    this.price=price;
  }

  public int getPrice()
  {
    return price;
  }

  public void setDamage(String dmgDie)
  {
    this.dmgDie=dmgDie;
  }

  public int getDamage()
  {
   
    return Dice.d4();
  }

  public String getDice()
  {
    return dmgDie;
  }

  public void setClass(String wClass)
  {
    weaponClass=wClass;
  }

  public String getWClass()
  {
    return weaponClass;
  }





}