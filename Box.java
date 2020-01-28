import java.util.*;
class Box
{
double w,h,d;
Box(double width,double height,double depth)
{
w=width;
h=height;
d=depth;
}
double volume()
{
double vol=w*h*d;
return vol;
}
public static void main(String args[])
{
Box obj=new Box(20.0,10.6,30.5);
System.out.println(obj.volume());
}
}
