package score;

import java.util.LinkedList;

public class ScoreBoard {

  private int size;
  private LinkedList<Score> board = new LinkedList<Score>();

  public ScoreBoard(int size) {
    this.size = size;
    for ( int i = 0; i < size; i++) {
      board.add(new Score("___", 0));
    }
  }

  public boolean add(Score score) {
    for (int i = 0; i < this.size; i++) {
      if (score.getScore() > board.get(i).getScore()) {
        board.add(i, score);
        return true;
      }
    } 
   return false; 
  }

  public void remove(Score score) {
    String name = score.getName();
    board.remove(score); 
    System.out.println(name + " removed!");
  }

  public void print() {
    System.out.println("-------The Score Board-------");
    for (int i = 0; i < this.size; i++) {
      Score cur = board.get(i);
      System.out.println(cur.getName() + "------" + cur.getScore());
    }
  }
}
