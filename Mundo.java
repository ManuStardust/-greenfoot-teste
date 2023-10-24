import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Manu_Stardust 
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("funkiejam.mp3");
    public void started()
    {
    bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
/**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        bimogif bimogif = new bimogif();
        addObject(bimogif,452,256);
        bimogif.setLocation(352,284);
        bimogif.setLocation(352,284);
        bimogif.setLocation(352,284);
        bimogif.setLocation(352,284);
        removeObject(bimogif);
        Counter counter = new Counter();
        addObject(counter,49,24);
        marceline marceline = new marceline();
        addObject(marceline,711,452);
        jake jake = new jake();
        addObject(jake,167,498);
        Counter2 counter2 = new Counter2();
        addObject(counter2,743,24);
    }
}
