class TwoDShape {
private double width;
private double height;
void showDim()  {
System.out.println("Width and height are " +
                      width + " and " + height);
}
}
class Triangle extends TwoDShape {
String style;
double area() {
return width * height / 2;
}
void showStyle() {
System.out.println("Triangle is " + style);
}
}
