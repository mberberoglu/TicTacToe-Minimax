/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.nemesis;

/**
 *
 * @author mustafa
 */
public class GameClass {
    int winArray[][]    = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int field[]          = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    public GameClass() {

    }
    
    public void playPlayer(int position) {
        this.field[position] = -1;
    }
    
    public int playComputer() {
        int tempField[] = this.field;
        int move = -1;
        int score = -2;
        int i;
        for (i = 0; i < 9; ++i) {
            if (tempField[i] == 0) {
                tempField[i] = 1;
                int tempScore = -minimax(tempField, -1);
                tempField[i] = 0;
                if (tempScore > score) {
                    score = tempScore;
                    move = i;
                }
            }
        }
        if (move != -1) {
            this.field[move] = 1;
        }
        return move;
    }

    public int winner() {
        for (int i = 0; i < 8; ++i) {
            if (this.field[this.winArray[i][0]] != 0 &&
                this.field[this.winArray[i][0]] == this.field[this.winArray[i][1]] &&
                this.field[this.winArray[i][0]] == this.field[this.winArray[i][2]]) {
                return field[this.winArray[i][2]];
            }
        }
        return 0;
    }

    private int minimax(int tempBoard[], int player) {
        int winner = this.winner();
        if (winner != 0) {
            return winner * player;
        }
        
        int move = -1;
        int score = -2;
        int i;
        for (i = 0; i < 9; ++i) {
            if (tempBoard[i] == 0) {
                tempBoard[i] = player;
                int thisScore = -minimax(tempBoard, player * -1);
                if (thisScore > score) {
                    score = thisScore;
                    move = i;
                }
                tempBoard[i] = 0;
            }
        }
        if (move == -1) {
            return 0;
        } else {
            return score;
        }
    }

    public boolean isFinished() {
        int check = 0; 
        for(int value : this.field) {
            if (value != 0) {
                check++;
            }
        }
        return check == 9;
    }

    public void reset() {
        int clearField[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.field = clearField;
    }
}
