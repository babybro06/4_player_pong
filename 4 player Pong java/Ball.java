class Ball extends Rectangle {
   
    private double vx;
    private double vy;
    private Schläger schlägerLinks;
    private Schläger schlägerRechts;
    private Schläger2 schlägerOben;
    private Schläger3 schlägerUnten;
    Pong p;
  //I o  S  
 
    Ball(double breite, double x, double y, Schläger schlägerLinks, Schläger schlägerRechts, Schläger2 schlägerOben, Schläger3 schlägerUnten, Pong pNeu) {
       super(x - breite / 2, y - breite / 2, breite, breite);
       setFillColor(Color.white);
       this.schlägerLinks = schlägerLinks;
       this.schlägerRechts = schlägerRechts;
       this.schlägerOben = schlägerOben;
       this.schlägerUnten = schlägerUnten;
       p = pNeu;
 
       setzeZufallsGeschwindigkeit();
    }
 
    public void act() {
       System.out.println(getCenterX());
       System.out.println(getCenterY());
       move(vx, vy);
       ballZurücksetzen();
 /**
       if(getCenterY() < getHeight() / 2) {
          vy = vy * (-1);
       }
 
       if(getCenterY() + getHeight() / 2 > 600) {
          vy = vy * (-1);
       }
 **/
       if(collidesWith(schlägerLinks) || collidesWith(schlägerRechts)) {
          vx = vx * (-1);
       }
 
       if(collidesWith(schlägerOben) || collidesWith(schlägerUnten)) {
          vy = vy * (-1);
       }
 
       if(getCenterX() < getWidth() / 2) {
          p.punktFürLinkenSpieler();
          setzeZufallsGeschwindigkeit();
          moveTo(400, 300);
       }
 
       if(getCenterX() > 850 + getWidth() / 2) {
          p.punktFürRechtenSpieler();
          setzeZufallsGeschwindigkeit();
          moveTo(400, 300);
       }
       if(getCenterY() > 650 + getHeight() / 2) {
          p.punktFürUnterenSpieler();
          setzeZufallsGeschwindigkeit();
          move(400, 300);
       }
       if(getCenterY() < 0 + getHeight() / 2) {
          p.punktFürOberenSpieler();
          setzeZufallsGeschwindigkeit();
          move(400, 300);
       }
    }
    
 
    void setzeZufallsGeschwindigkeit() {
 
       double r = Math.random() * 5 + 5;
       double winkelGrad = Math.random() * 50 + 20;
       double winkelRad = winkelGrad / 180 * Math.PI;
       
       vx = r * Math.cos(winkelRad);
       vy = - r * Math.sin(winkelRad);
 
       if(Math.random() < 0.5) {
          vx = -vx;
       }
 
       if(Math.random() < 0.5) {
          vy = -vy;
       }
    }
    void ballZurücksetzen() {
       double x = getCenterX();
       double y = getCenterY();
       if(x > 850 || y > 650) {
          move(400, 300);
       }
    }
 }