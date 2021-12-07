import java.util.Locale;

public class Util {
  public static String getOppositeDirection(String previousDirection) {
    switch (previousDirection.toLowerCase(Locale.ROOT)) {
      case "up":
        return "down";
      case "down":
        return "up";
      case "left":
        return "right";
      case "right":
        return "left";
      default:
        return "you gut lost, you idiot";
    }
  }
}
