 class Snake {}
public class Cobra extends Snake {}
 class GardenSnake {}
class SnakeHandler {
private Snake snake;
public void setSnake(Snake snake) { this.snake = snake; }
public static void main(String[] args) {
new SnakeHandler().setSnake( new Cobra());
}
}

/*new Cobra()
B.  new GardenSnake()
C.  new Snake()
D.  new Object()
E.  new String("Snake")
F.  null*/