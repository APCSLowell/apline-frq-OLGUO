public class APLine
{
  /* your code here */
  private int a, b, c;
  public Apline(int a1, b1, c1){
    a = a1; 
    b = b1;
    c = c1;
  }
  public double getSlopes(){
    return -(double)a / b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y + c == 0;
  }
}
