import java.util.*;
//Benjamin Apter
//A collection of methods that create different patterns using loops.
//Used to practice loops for ap exam.
public class pattern {

public static void stars(int rows){
     int currentRow = 1;
while (currentRow <= rows) {
     int totalStars = currentRow * 2 - 1;
     int starCount = 0; 

while(starCount < totalStars) { 
     System.out.print("*");
     starCount++;}
  

     System.out.println();
     currentRow++;
 }
}

public static void triangle(int rows){
     int currentRow = 1;
while (currentRow <= rows) {
     int count =  currentRow;
     int number = 0;
while (number < count) {
     System.out.print(count);
     number++;

}
System.out.println();
currentRow++;




 }
}

public static void odds(int start){
    int currentRow = start;
while (currentRow >= 0) {
     int count =  currentRow;
     int number = 0;
while (number < count && ((number % 2) != 0)) {
     System.out.print(count);
     number++;

}
System.out.println();
currentRow--;




 }
}





     public static void main(String []args){
     stars(7);
     triangle(9);
     odds(9);
    }
}