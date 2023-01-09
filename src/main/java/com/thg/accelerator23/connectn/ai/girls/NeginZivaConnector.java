package com.thg.accelerator23.connectn.ai.girls;

import com.thehutgroup.accelerator.connectn.player.Board;
import com.thehutgroup.accelerator.connectn.player.Counter;
import com.thehutgroup.accelerator.connectn.player.Player;

import java.util.Random;


public class NeginZivaConnector extends Player {
  public NeginZivaConnector(Counter counter) {
    //TODO: fill in your name here
    super(counter, NeginZivaConnector.class.getName());
  }

  @Override
  public int makeMove(Board board) {
    //TODO: some crazy analysis
    //TODO: make sure said analysis uses less than 2G of heap and returns within 10 seconds on whichever machine is running it
    Random rand = new Random();
    int upperbound = 10;
    int int_random = rand.nextInt(upperbound);

    return int_random;
  }
}
