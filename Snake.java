import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Snake extends Actor{
GreenfootSound elephantSound = new GreenfootSound("elephant-352698.mp3");
GreenfootImage image = new GreenfootImage("snake idle.gif"); 


    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);    
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);    
        }// Add your action code here.
    }
    public void catchCoin()
    {
        ((MyWorld)getWorld()).addScore(1);
        elephantSound.play();
    }
}

