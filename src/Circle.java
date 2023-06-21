public class Circle {
  private Double radius;
  private String color;

  public Circle(){
    this.radius = 1.0;
    this.color = "red";
  }

  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
  }

  public Double getArea() {
    return Math.PI * radius * radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
