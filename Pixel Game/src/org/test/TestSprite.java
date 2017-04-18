package org.test;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.graphics.Renderer;
import org.input.Input;
import org.object.Sprite;

public class TestSprite extends Sprite {

  public TestSprite(float posX, float posY) {
    super(posX, posY);
    
    try {
      image = Renderer.loadImage("/resources/images/ewok.gif");
      System.out.println(image);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public void update(float deltaTime) {
    if (Input.getKey(KeyEvent.VK_W) || Input.getKey(KeyEvent.VK_UP)) {
      posY -= 80 * deltaTime;
    }
    if (Input.getKey(KeyEvent.VK_S) || Input.getKey(KeyEvent.VK_DOWN)) {
      posY += 80 * deltaTime;
    }
    if (Input.getKey(KeyEvent.VK_A) || Input.getKey(KeyEvent.VK_LEFT)) {
      posX -= 80 * deltaTime;
    }
    if (Input.getKey(KeyEvent.VK_D) || Input.getKey(KeyEvent.VK_RIGHT)) {
      posX += 80 * deltaTime;
    }
  }
}
