package com.example.snake;

import java.util.Collection;
import java.util.List;

public interface SnakeGrowingStrategy {
  void move();
  List<SnakeSegment> growElements();

  void collidesWith(SpacialElement element);
}
