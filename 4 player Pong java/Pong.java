Pong p = new Pong();

class Pong {
   Text punkteanzeige;
   Text loserMessage;
   int punkteLinks = 5;
   int punkteRechts = 5;
   int punkteOben = 5;
   int punkteUnten = 5;
  

   Schläger links;
   Schläger rechts;
   Schläger2 oben;
   Schläger3 unten;
   Ball ball;

   Pong() {
    //I   
      links = new Schläger(0, 20, 200, 300, "q", "a", Color.aqua);
      rechts = new Schläger(800 - 20, 20, 200, 300, "u", "j", Color.crimson);
      oben = new Schläger2(300, 200, 20, 300, "c", "x", Color.blueviolet);
      unten = new Schläger3(300, 200, 20, 600, "o", "p", Color.darkgreen);
      ball = new Ball(20, 400, 300, links, rechts, oben, unten, this);

      punkteanzeige = new Text(400, 20, 64, "");
      punkteanzeige.setAlignment(Alignment.center);
      punkteanzeige.setFillColor(Color.white);
      punkteAnzeigen();
      loserMessage = new Text(400, 300, 80, "");
      loserMessage.setAlignment(Alignment.center); 
      loserMessage.setFillColor(Color.darkred);
   } 
//D
   void punkteAnzeigen() {
      punkteanzeige.setText("L" + punkteLinks + " : " + "R" + punkteRechts + " : " + "O" + punkteOben + " : " + "U" + punkteUnten);
      
   }

   void loserMessage() {
      loserMessage.setText("We have a loser :)");
      //System.exit(0);
   }

   void punktFürRechtenSpieler() {
      punkteRechts--;
      if(punkteRechts > -1) {
         punkteAnzeigen();
      }
      else {
         loserMessage();
      }
   }

   void punktFürLinkenSpieler() {
      punkteLinks--;
      if(punkteLinks > -1) {
         punkteAnzeigen();
      }
      else {
         loserMessage();
      }
   }
   void punktFürOberenSpieler() {
      punkteOben--;
      if(punkteOben > -1) {
         punkteAnzeigen();
      }
      else {
         loserMessage();
      }
   }
   void punktFürUnterenSpieler() {
      punkteUnten--;
      if(punkteUnten > -1) {
         punkteAnzeigen();
      }
      else {
         loserMessage();
      }
   }
}