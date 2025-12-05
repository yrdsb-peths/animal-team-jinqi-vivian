import greenfoot.*;
public class MyWorld extends World {
    private int score = 0;
    private Snake snake;
    private int time = 1800;
    private Background background;
    public MyWorld() {
         
        super(600, 400, 1);
        Snake snake = new Snake();
        addObject(snake, 300, 350);
        addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);
        showText("Time: 30", 520, 20);
        GreenfootImage bg = new GreenfootImage("下载.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Coin(), Greenfoot.getRandomNumber(600), 0);    
        }
        time--;
        if(time % 60 == 0)
        {
            showText("Time: " + (time / 60), 520, 20);    
        }
        if(time == 0)
        {
            showText("Final score: " + score, 300, 200);
            Greenfoot.stop();
        }
    } 
      public void addScore(int points)
    {
        score += points;
        showText("Score: " + score, 50, 20);
    }
}


