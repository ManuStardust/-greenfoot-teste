import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    private int atraso = 0;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act() {
        //Diálogo do primeiro personagem
        if (Greenfoot.isKeyDown("enter") && (atraso== 0)){
            setBackground(new GreenfootImage("marcelinefala.png"));
            atraso++;
        }
        else{
            if (!Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
        }
        //Diálogo segundo personagem
        if (Greenfoot.isKeyDown("space")){
            setBackground(new GreenfootImage("faladejake.png"));
        }
        
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("shift")){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
            atraso++;
        }
         else{
            if (!Greenfoot.isKeyDown("enter")){
                atraso = 0;
            }
    }
}
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}

