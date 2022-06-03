package springdemo.springtutorial.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GameConsole {

    @Override
    public void up(){
        System.out.println("Up");
    }
    @Override
    public void down(){
        System.out.println("Down");
    }
    @Override
    public void left(){
        System.out.println("Left");
    }
    @Override
    public void right(){
        System.out.println("Right");
    }
    @Override
    public void jump(){
        System.out.println("Jump");
    }
    @Override
    public void shoot(){

    }

}
