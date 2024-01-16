World w1 = new World(800, 600);
w1.setBackgroundColor(new Color(51, 53, 48));


class Schläger3 extends Rectangle {
   
   String tasteRauf;
   String tasteRunter;

   double dy = 10;
   
   Schläger3(int abstand_von_wand, int breite, int höhe, int platzierung_höhe, String tra, String tru, String farbe) {
      super(abstand_von_wand, 600 - höhe, breite, höhe);
      
      tasteRauf = tra;
      tasteRunter = tru;
      
      setFillColor(farbe);
      
   }

   public void act() {
      if(isKeyDown(tasteRauf)) {
         if(getCenterY() > getWidth() / 2) {
            move(-dy, 0);
         }
      }
      
      if(isKeyDown(tasteRunter)) {
         if(getCenterY() + getWidth() / 2 < 800) {
            move(dy, 0);
         }
      }
      
   }
}