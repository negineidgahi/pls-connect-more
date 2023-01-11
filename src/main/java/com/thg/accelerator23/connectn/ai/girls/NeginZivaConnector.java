package com.thg.accelerator23.connectn.ai.girls;

import com.thehutgroup.accelerator.connectn.player.Board;
import com.thehutgroup.accelerator.connectn.player.Counter;
import com.thehutgroup.accelerator.connectn.player.Player;
import com.thehutgroup.accelerator.connectn.player.GameConfig;

import java.awt.*;
import java.util.Random;


public class NeginZivaConnector extends Player {
  public NeginZivaConnector(Counter counter) {
    //TODO: fill in your name here
    super(counter, NeginZivaConnector.class.getName());
  }

  @Override
  public int makeMove(Board board) {
    class GFG {

      // Initial values of
// Alpha and Beta
      static int MAX = 1000;
      static int MIN = -1000;

      // Returns optimal value for
// current player (Initially called
// for root and maximizer)
      static int minimax(int depth, int nodeIndex, Boolean maximizingPlayer, int values[], int alpha, int beta) {
        // Terminating condition. i.e
        // leaf node is reached
        if (depth == 3)
          return values[nodeIndex];

        if (maximizingPlayer) {
          int best = MIN;

          // Recur for left and
          // right children
          for (int i = 0; i < 2; i++) {
            int val = minimax(depth + 1, nodeIndex * 2 + i, false, values, alpha, beta);
            best = Math.max(best, val);
            alpha = Math.max(alpha, best);

            // Alpha Beta Pruning
            if (beta <= alpha)
              break;
          }
          return best;
        } else {
          int best = MAX;

          // Recur for left and
          // right children
          for (int i = 0; i < 2; i++) {

            int val = minimax(depth + 1, nodeIndex * 2 + i,
                    true, values, alpha, beta);
            best = Math.min(best, val);
            beta = Math.min(beta, best);

            // Alpha Beta Pruning
            if (beta <= alpha)
              break;
          }
          return best;
        }
      }

      // Driver Code
      public static void main(String[] args) {

        int values[] = {3, 5, 6, 9, 1, 2, 0, -1};
        System.out.println("The optimal value is : " +
                minimax(0, 0, true, values, MIN, MAX));

      }
    }
    return 0;
  }
}


//    Random rand = new Random();
//    int upperbound = 10;
//    int int_random = rand.nextInt(upperbound);
//    return int_random;

//
//class MiniMaxAI extends Player {
////  this variable holds the maximum depth that MiniMaxAI algo will reach for this player.
//  private int maxDepth;
//
//  public int getMaxDepth() {
//    return maxDepth;
//  }
//
//  public void setMaxDepth(int maxDepth) {
//    this.maxDepth = maxDepth;
//  }
//
//  public MiniMaxAI(int maxDepth, Counter String) {
//    super(Counter);
//    this.maxDepth = maxDepth;
//  }
//
//  public GameConfig makeMove(Board board) {
//    //if player x plays then it wants to maximize the heurisics value.
//    if (Player(String name) == Counter c = Counter.X) {
//      return max(new Board(board), 0);
//    }
//    //if player 0 plays then it wants to minimize the value.
//    else {
//      return min(new Board(board), 0);
//    }
//  }
//  private GameConfig max(Board board, int depth) {
//    Random r = new Random();
//
//  }




