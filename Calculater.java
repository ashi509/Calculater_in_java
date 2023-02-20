import java.util.*;
class Calculater{
int a , b;
public static void main(String args[]){
Calculater c=new Calculater(); 
c.input();
c.output();


}
 void input(){
System.out.println("Enter any Two number whose you want to  calculate");
 Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();

}
void output(){
Scanner sc1=new Scanner(System.in);
int x;
System.out.println("Please select a  number From 1 To 5");
System.out.println( "  For Addition press :1  \n  For Substraction press :2  \n  For Multiplication press: 3  \n  For Division press: 4  \n  For Remainder press :5" );
 x=sc1.nextInt();

 if(x==1){
System.out.println("The Addition of given number is :"+(a+b));
}
else if (x==2){
System.out.println("The  Substraction of given number is :"+(a-b));
}
else if(x==3){
System.out.println("The multiplication of given number is :"+(a*b));
}
else if(x==4){
System.out.println("The Division of given number is :"+(a/b));

}
else if(x==5){
System.out.println("The Remainder of given number is :"+(a%b));
}
else{
System.out.println("Please enter right number from 1 to 5");
}
}


}