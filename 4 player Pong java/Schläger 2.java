World w1 = new World(800, 600);
w1.setBackgroundColor(new Color(51, 53, 48));


class Schläger2 extends Rectangle {
   
   String tasteRauf;
   String tasteRunter;

   double dy = 10;
   
   Schläger2(int abstand_von_wand, int breite, int höhe, int platzierung_höhe, String tra, String tru, String farbe) {
      super(abstand_von_wand, höhe, breite, höhe);
      
      tasteRauf = tra;
      tasteRunter = tru;
      
      setFillColor(farbe);
      
   }

   public void act() {
      if(isKeyDown(tasteRauf)) {
         if(getCenterY() > getHeight() / 2) {
            move(dy, 0);
         }
      }
      
      if(isKeyDown(tasteRunter)) {
         if(getCenterY() + getHeight() / 2 < 600) {
            move(-dy, 0);
         }
      }
      
   }
}