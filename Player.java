package Jogo;

import Jogo.GamePanel;
import Jogo.KeyHandler;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler kh;
    
    Player(GamePanel gp, KeyHandler kh) {
        this.gp = gp;
        this.kh = kh;
    }

    public setDefaultValues(){
        
    }
}