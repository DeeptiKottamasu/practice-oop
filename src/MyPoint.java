public class MyPoint {
  private int x;
  private int y;

  public MyPoint(int x, int y){
    this.x = x;
    this.y = y;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public int[] getXY() {
   return new int[]{ x, y};
  }
  public void setX(int x) {
    this.x = x;
  }
  public void setY(int y) {
    this.y = y;
  }

  public void setXY(int x, int y){
    this.x = x;
    this.y = y;
  }

  public double distance(){
    return x*x + y*y;
  }
  public double distance(MyPoint p){
    int x2 = p.getX();
    int y2 = p.getY();
    return Math.pow(x- x2, 2) + Math.pow(y- y2, 2);
  }
  public double distance(int x, int y){
    return (x- this.x)*(x- this.x) + (y- this.y)*(y- this.y);
  }
}
