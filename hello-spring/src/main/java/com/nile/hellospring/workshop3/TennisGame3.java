package com.nile.hellospring.workshop3;

// warning
// naming
// magic number -> ตัวเลข 4,6,1 คืออะไร

// logic
// เทนนิส 1 เกม เริ่มที่ 0-0
// 0-0 คนขาลจะพูดว่า love all
//
public class TennisGame3 {
    private int player2Score;
    private int player1Score;
    private String player1Name;
    private String player2Name;
    private String[] point = {"Love", "Fifteen", "Thirty", "Forty"};
    private String score;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String s;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            score = point[player1Score];
            return (player1Score == player2Score) ? score + "-All" : score + "-" + point[player2Score];
        } else {
            if (this.isDeuce()) {
                return "Deuce";
            }
           return this.getAdvantageWinner();
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1Score += 1;
        else
            this.player2Score += 1;
    }

    public boolean isDeuce(){
        return player1Score == player2Score;
    }

    public String getPlayer(){
        return player1Score > player2Score ? player1Name : player2Name;
    }

    public String getAdvantageWinner(){
        this.score = this.getPlayer();
        return ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + score : "Win for " + score;
    }

}
