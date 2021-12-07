package com.example.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake {
  private final SnakeGrowingStrategy growingStrategy;
  private List<SnakeSegment> elements = new ArrayList<>();

  public Snake(SnakeGrowingStrategy growingStrategy) {
    this.growingStrategy = growingStrategy;
  }

  public void collidesWith(SpacialElement element) {
    this.growingStrategy.collidesWith(element);
  }

  public void move() {
    this.growingStrategy.move();
    this.elements.addAll(this.growingStrategy.growElements());
  }

  public int size() {
    return this.elements.size();
  }
}
