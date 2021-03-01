package score;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    ScoreBoard scoreBoard = new ScoreBoard(5);
    scoreBoard.add(new Score("Adam", 77));
    scoreBoard.add(new Score("Jack", 78));
    scoreBoard.add(new Score("Jill", 100));
    scoreBoard.add(new Score("Mark", 50));
    scoreBoard.add(new Score("John", 101));
    scoreBoard.add(new Score("Jess", 105));
    scoreBoard.add(new Score("Mike", 20));
    Score k = new Score("Konstantine", 199);
    scoreBoard.add(k);
    scoreBoard.print();
    scoreBoard.remove(k);
    scoreBoard.print();
  }
}
