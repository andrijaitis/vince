public class Elite extends Member{ 

private double tournamentTime1; //100m Freestyle 
private double tournamentTime2;//200m Backstroke
private double tournamentTime3;//100m Butterfly


   public void setTournament1(double TournamentTime1){
      TournamentTime1 = tournamentTime1;
      }
  
   public void setTournament2(double TournamentTime2){
   TournamentTime2 = tournamentTime2;
   }

   public void setTournament3(double TournamentTime3){
      TournamentTime3 = tournamentTime3;
      }


public double getTournamentTime1(){
   return  tournamentTime1;
   }
   
   public double getTournamentTime2(){
   return  tournamentTime2;
   }
   
   public double getTournamentTime3(){
   return  tournamentTime3;
   }

}