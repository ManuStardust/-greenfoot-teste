import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bimogif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bimogif extends Actor
{
    GifImage mygif = new GifImage("bimo.gif");
    /**
     * Act - do whatever the bimogif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mygif.getCurrentImage());// Add your action code here.
    }
}
