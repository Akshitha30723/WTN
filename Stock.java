import java.util.*;
class Stock
{
String stock_name;
String stock_symbol;
double prev_price;
double cur_price;
Stock()
{
stock_name="xxxx";
stock_symbol="y";
prev_price=30.4;
cur_price=40.2;
}
Double changePercentage()
{
Double per=(cur_price-prev_price)*100/prev_price;
return per;
}
public static void main(String args[])
{
Stock obj = new Stock();
System.out.println(obj.changePercentage());
}
}