abstract class Shape{
 double x;
 double y;
 Shape(double x,double y){
   this.x=x;
   this.y=y;
   }
abstract double area();
}
class triangle extends Shape{
 triangle(double x, double y)
{
  super(x,y);
}
double area(){
  return 0.5*x*y;
}
}
class Rect{
public static void main(String args[])
{
triangle tri=new triangle(5,6);
System.out.println("area of triangle"+tri.area());
}
}