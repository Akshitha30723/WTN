import java.util.*;
class Demo
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j,max;
Scanner sc=new Scanner(System.in);
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
max=a[0][0];
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(a[i][j]>max){
max=a[i][j];
}
}
}
System.out.println(max);
}
}