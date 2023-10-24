import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jake extends Actor
{
    
    /**
     * Act - do whatever the jake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
        
    }
    public void movimento(){
        GreenfootSound jake = new GreenfootSound("barulhopoucomendo.mp3");
        int speed=3;
         if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
          else if (Greenfoot.isKeyDown("F")){
            getWorld().addObject(new sanduba(), getX() +100, getY() +30); 
        }
        
    }
}
