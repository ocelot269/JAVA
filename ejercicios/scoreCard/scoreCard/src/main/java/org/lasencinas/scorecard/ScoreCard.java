
package org.lasencinas.scorecard;


public class ScoreCard {
    
    
    
    
    public ScoreCard(){
    
    }
    
    public int getSampleScore(String score){
        int scoreTotal=0;
        for (int num=0;num < score.length(); num++) {
            if (score.charAt(num)=='-'){
                scoreTotal +=0;
            }else{
            
            scoreTotal+=Integer.parseInt(Character.toString(score.charAt(num)));
            }
        }
        return scoreTotal;
    }
    
}
