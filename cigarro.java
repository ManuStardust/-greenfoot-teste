import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class cigarro extends Actor{
    public void act()
    {
       moveAtaque();
           GreenfootSound marceline = new GreenfootSound("barulhopoucomendo.mp3");
    }
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x,y);
    }
      public void acertarAlvo() {
        Actor a = getOneIntersectingObject(jake.class);
        
        if (a != null){
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
            
                getWorld().removeObject(a);
                getWorld().removeObject(this);
            }
                
        }
}

