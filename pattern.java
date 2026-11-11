import java.util.*;
//Benjamin Apter
//A collection of methods that create different patterns using loops.
//Used to practice loops for ap exam.
public class pattern {

     
//Precondition: Parameter rows, the number of rows to print.
//Postcondition: Prints rows of stars increasing by two stars per row.
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
 }System.out.println();

}
 //Precondition: Parameter rows, the number of rows to print.
//Postcondition: Prints a triangle with each row's number repeated that many times. 
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




 }System.out.println();

}

//Precondition:  Parameter start, the starting number     
//Postcondition: Prints odd numbers in descending order.
//Postcondition: Each odd number is repeated that many times on its own line.
public static void odds(int start){
    int currentRow = 0;
for(currentRow = start; currentRow >= 0; currentRow--) {
    
for ( int number = 0; number < currentRow; number++) {
    
    if((currentRow % 2) != 0) {
     System.out.print(currentRow); }

}
if((currentRow % 2) != 0) {
     System.out.println(); }
     




 }System.out.println(); }

//Precondition: Parameter, maxE the number of letters in the longest row.     
//Postcondition: Prints alternating rows of E and O that increase and then decrease.
//Postcondition: The longest row always contains E.
//Postcondition: Prints the increasing half, and the longest row
public static void eo(int maxE){

if (maxE%2 != 0)
{
int max = maxE;


for (int i = 1; i<=max; i++ ) {
if (i % 2 != 0) {
   for(int k = 0 ; i > k ; k++) {
     System.out.print("E");
   }

}else if (i % 2 == 0) {
   for(int k = 0 ; i > k ; k++) {
     System.out.print("O");
   }

}





System.out.println();
}

for (int i = max - 1; i >= 1; i--) {
    if (i % 2 != 0) {
        for (int k = 0; k < i; k++) {
            System.out.print("E");
        }
    } else {
        for (int k = 0; k < i; k++) {
            System.out.print("O");
        }
    }

    System.out.println();
}





}





else { int max2 = maxE;
for (int i = 1; i<=max2; i++ ) {
if (i % 2 != 0) {
   for(int k = 0 ; i > k ; k++) {
     System.out.print("O");
   }

}else if (i % 2 == 0) {
   for(int k = 0 ; i > k ; k++) {
     System.out.print("E");
   }

}


System.out.println();
}

for (int i = max2 - 1; i >= 1; i--) {
    if (i % 2 != 0) {
        for (int k = 0; k < i; k++) {
            System.out.print("O");
        }
    } else {
        for (int k = 0; k < i; k++) {
            System.out.print("E");
        }
    }

    System.out.println();
}
    System.out.println();

}













System.out.println();


}

//Precondition: Parameter: rows, the number of rows in the pyramid.
//Postcondition: Prints an upside down number pyramid with increasing indentation.
public static void pyramid(int rows){
    
int numberToPrint = 1;
int row = rows;
while (row > 0) {
   
     int spacesToPrint = rows - row;

    for (int i = 0; i < spacesToPrint; i++) {
    System.out.print(" ");
}

 for (int i = 0; i < row * 2 - 1; i++) {
            System.out.print(numberToPrint);
        }

System.out.println();
row--;
numberToPrint++;
}




}

     
 




     //Precondition: All functions have correct inputs
    //Postcondition: Runs all the functions in the order they are written in the code.
     public static void main(String []args){
        System.out.println("Stars");
        System.out.println();

        stars(7);

        System.out.println("Triangle");
        System.out.println();

        triangle(9);

        System.out.println("Odds");
        System.out.println();

        odds(9);

        System.out.println("E and O Even");
        System.out.println();

        eo(6);
        
        System.out.println("E and O Odd");
        System.out.println();

        eo(5);

        System.out.println("Pyramid");
        System.out.println();

        pyramid(5);
    }
}
