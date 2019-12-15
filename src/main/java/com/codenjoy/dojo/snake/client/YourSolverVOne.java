package com.codenjoy.dojo.snake.client;


import com.codenjoy.dojo.client.Solver;
import com.codenjoy.dojo.client.WebSocketRunner;
import com.codenjoy.dojo.services.RandomDice;
import com.codenjoy.dojo.snake.client.incretiosnakesolver.IncretioSnakeSolver;

public class YourSolverVOne implements Solver<Board> {
    public YourSolverVOne(RandomDice randomDice) {
    }

    @Override
    public String get(Board board) {
        return new IncretioSnakeSolver(board).getNextStep().toString();
    }


    public static void main(String[] args) {
        WebSocketRunner.runClient(
                // paste here board page url from browser after registration
                "http://104.248.23.201/codenjoy-contest/board/player/5ymbt04zqoxu06ql8w9t?code=8437984181649069582",
                new YourSolverVOne(new RandomDice()),
                new Board());
    }
}
