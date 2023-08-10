package Jogo;

import Jogo.GamePanel;
import Jogo.KeyHandler;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;
    
    Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }

    public void setDefaultValues(){
        x = 4;
        y = 4;
        speed = 7;
    }
    
    public void playerMovement() {
    	
        if(keyH.upPressed == true){
            y -= speed;
            System.out.println("Subir funciona");
        }
        else if(keyH.downPressed == true){
            y += speed;
            System.out.println("baixo funciona");
        }
        else if(keyH.leftPressed == true){
            x -= speed;
            System.out.println("esquerda funciona");
        }
        else if(keyH.rightPressed == true){
            x += speed;
            System.out.println("direita funciona");
        }
    }
}