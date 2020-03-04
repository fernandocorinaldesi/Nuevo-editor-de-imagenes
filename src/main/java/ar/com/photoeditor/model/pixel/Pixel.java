package ar.com.photoeditor.model.pixel;

public class Pixel
{
  private int r;
  private int g;
  private int b;
  
  public Pixel(int r, int g, int b)
  {
    if ((!validate(r)) || (!validate(g)) || (!validate(b)))
      throw new RuntimeException("Los valores admitidos para cada canal de color es un entero positivo entre 0 y 255 inclusives");
    this.r = r;
    this.g = g;
    this.b = b;
  }
  
  public int getR() {
    return r;
  }
  
  public void setR(int r) {
    if (!validate(r))
      throw new RuntimeException("Los valores admitidos para cada canal de color es un entero positivo entre 0 y 255 inclusives");
    this.r = r;
  }
  
  public int getG() {
    return g;
  }
  
  public void setG(int g) {
    if (!validate(g))
      throw new RuntimeException("Los valores admitidos para cada canal de color es un entero positivo entre 0 y 255 inclusives");
    this.g = g;
  }
  
  public int getB() {
    return b;
  }
  
  public void setB(int b) {
    if (!validate(b))
      throw new RuntimeException("Los valores admitidos para cada canal de color es un entero positivo entre 0 y 255 inclusives");
    this.b = b;
  }
  
  private boolean validate(int v)
  {
    if ((v >= 0) && (v < 256))
      return true;
    return false;
  }
}
