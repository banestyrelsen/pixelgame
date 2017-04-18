package org.world;

import java.awt.Graphics;
import java.util.ArrayList;

import org.object.Sprite;

public class World_Test {

  public static World_Test currentWorld = null;
  private static long      lastTime     = System.nanoTime();

  public ArrayList<Sprite> sprites      = new ArrayList<Sprite>();

  public static void update() {
    float deltaTime = (System.nanoTime() - lastTime) / 1000000000.0f;
    lastTime = System.nanoTime();

    for (Sprite sprite : currentWorld.sprites) {
      sprite.update(deltaTime);
    }
  }

  public static void render(Graphics g) {
    for (Sprite sprite : currentWorld.sprites) {
      sprite.render(g);
    }
  }
}
