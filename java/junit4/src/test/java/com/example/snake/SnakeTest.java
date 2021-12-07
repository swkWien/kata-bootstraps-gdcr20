package com.example.snake;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SnakeTest {

  private Snake snake;
  private SnakeGrowingStrategy strategy;

  @Before
  public void createSnake() {
    this.strategy = mock(SnakeGrowingStrategy.class);
    this.snake = new Snake(strategy);
  }

  @Test
  public void snakeGrowsWhenMove() {
    var list = List.of(mock(SnakeSegment.class));
    when(strategy.growElements()).thenReturn(list);
    int size = this.snake.size();
    this.snake.move();
    assertEquals(size + 1, this.snake.size());
  }

  @Test
  public void snakeTurnLeft() {

  }

  @Test
  public void snakeTurnRight() {

  }

  @Test
  public void snakeDiesWhenHitItself() {

  }
  @Test
  public void snakeDiesWhenHitTheBorder() {

  }

  @Test
  public void snakeDiesWhenHitNonConsumableElement() {

  }

}
