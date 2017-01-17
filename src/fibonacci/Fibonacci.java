
package fibonacci;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
/**
 *Task one: Reproduce the Fibonacci Table to 51.
 *Task two: produce Fibonacci Table to 100.
 *Task three: check if a user number is a Fibonacci number.
 *Task four: check how many random numbers are Fibonacci.
 *Task five: Loop until a random number is a Fibonacci number.
 *Task six: show Fibonacci numbers above and below a user's number.
 *Task seven: show what Fibonacci numbers make up any given user number.
 *Task eight: Fibonacci Farmer.
 *
 * @author Steven Gibson
 */
public class Fibonacci
{

    
    
    public static void main(String[] args)
    {
        //prints out to the screen and asks the user their name.
        System.out.println("Welcome, Please enter your name"); 
        Scanner scuser = new Scanner(System.in);
        String user = scuser.nextLine();
        
        int loop = 1;
        while (loop==1)
        {
        System.out.println("1: For task one Reproduce Fibonacci Table");
        System.out.println("2: For task two produce Fibonacci Table to 100 ");
        System.out.println("3: For task three check if a user number is a Fibonacci number ");
        System.out.println("4: For task four check how many random numbers are Fibonacci");
        System.out.println("5: For task five Loop until a random number is a Fibonacci number");
        System.out.println("6: For task six show Fibonacci numbers above and below a user's number");
        System.out.println("7: For task seven show what Fibonacci numbers make up any given user number");
        System.out.println("8: For task eight Fibonacci Farmer");
        System.out.println("9: Quit");
        
        //prints a welcome message with the users's name and asks for them to select a task
        System.out.println("Welcome "+ user+", Please select a program");
        Scanner sc = new Scanner(System.in);
        //gets the the number that the user enters and assigns it to the variable "select" 
        String select = sc.nextLine();
        //it will start the task based on the number the user eneters
        switch(select)
        {
            case "1":
                fibbi(user); //task one Reproduce Fibonacci Table
                break;
            case "2":
                fibbi100(user); //task two produce Fibonacci Table to 100 
                break;
            case "3":    
                fibbi_find(user); //task three check if a user number is a Fibonacci number
                break;
            case "4":
                fibbi_Random(user); //task four check how many random numbers are Fibonacci
                break;
            case "5":
                fibbi_while(user); // five Loop until a random number is a Fibonacci number
                break;
            case "6":
                fibbi_compare(user); //task six show Fibonacci numbers above and below a user's number
                break;
            case "7":
                fibbi_add(user); //task seven show what Fibonacci numbers make up any given user number
                break;
            case "8":
                  fibbi_farm(user); //ask eight Fibonacci Farmer
                break;
            case "9":
                System.out.println("goodbye "+user); // Exit the program
                loop=2;
                break;
                
            default:
                System.out.println("Error please reselect"); //error checking makeing sure the user selected 1-9
                break;
        }
        }
  
        
    }
    
    
    public static void fibbi(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi table to 51");
        // this allows the program to start populating the array from position 1
        long count=1;
        //builds an populates the array
        long  number = 4000000 , answer =0,F1=0,F2=1;
        System.out.println("F0" +" "+answer); 
        while (answer<=number)
            
         {
             //makes the fibonacci numbers by adding
             answer = F1+(F2);
             F2=F1;
             F1=answer;
             
             //prints out the answer
             System.out.println("F"+count + " " + answer);
             //increases the counter
             count++;
         }
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");
    }
    
    public static void fibbi_find(String user)
    {      
    //Build and populate a fibbi array
    
    String name =user;
        System.out.println("welcome "+name+ " to Fibbi Find");
        long[] fib = new long [52];
        //populate the array with 0's
        for (int k=0;k<fib.length;k++)
    {
        fib[k]=0;
        
    }
        int count=1;
        long  number = 51 , answer,F1=0,F2=1;
        //populate the array with the fibonacci numbers
        while (count<=number)
            
         {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
         }    
        
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        //asks the user to enter a number
        System.out.println("Please enter a number");
        int find = sc.nextInt();
        { 
            for (int i = 0; i < fib.length; i++)
          {
              //if it finds the number in the array it will exit
                 if (fib[ i ]  == find)
                {
                         found = true;      
                         break;
                 }
           } 
            //if it is not a fibonacci number
        if (found==false)
        {
            System.out.println(find + " not a fibonacci number");
        }
        //if it is a fibonacci number
        else 
        {
            System.out.println(find + " is a fibonacci number");
        }
    }
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");
    }
    public static void fibbi100(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi to 100");
        int number = 100, count = 1;
        BigInteger answer = new BigInteger("0");
        BigInteger F1 = new BigInteger("0");
        BigInteger F2 = new BigInteger("1");
        //builds and populates the array
        System.out.println("F0" +" "+answer);
        while (count<=number)
            
         {
             answer = F1.add(F2);
             F2=F1;
             F1=answer;
             
             
             System.out.println("F"+count + " " + answer);
             count++;
         }
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");
    }
    
    public static void fibbi_Random(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi Random");
        //Build and populate a fibbi array
    {
        long[] fib = new long [52];
        for (int k=0;k<fib.length;k++)
    {
        fib[k]=0;
        
    }
        int count=1;
        long  number = 51 , answer ,F1=0,F2=1;
        
        while (count<=number)
            
         {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
         }    
    

        int found_count = 0;
        Random randomNum = new Random();
        //runs for 30 times
        for (int i = 0; i <= 30; i++)
        {
            //generates a random number for the 
            int randomInt = randomNum.nextInt(100000);
            System.out.println("Generated "+i+" :" + randomInt);
            for (int find = 0; find < fib.length; find++)
          {
              //if the random number = a number in the array
                 if (fib[ find ]  == randomInt)
                {
                    //count adds 1
                     found_count++;    
                     
                 }
                              
           } 
            
            
        }
        //prints out the number of random numbers that were found to the screen
        System.out.println("in the batch of numbers " + found_count+ " were found");
        
    }
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");
    }
    public static void fibbi_while(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi_While");
        //Build and populate a fibbi array
        
        long[] fib = new long [52];
        for (int k=0;k<fib.length;k++)
        {
        fib[k]=0;
        
        }
            int count=1;
            long  number = 51 , answer ,F1=0,F2=1;
        
            while (count<=number)
            
            {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
            }   
            
            boolean found = false;
            int found_count = 1;
            Random randomNum = new Random();
            int randomInt;
            //this will keep the program running until the exit condiition is met on this case found being true
            while (found == false)
            {
                //selects a random from 0- 1000
                randomInt = randomNum.nextInt(1000);

                for (int find = 0; find < fib.length; find++)
                {
                    //checks if the random number is a fibonacci number by comparing it t the array 
                    if (fib[ find ]  == randomInt)
                    {
                     found = true;  
                     
                    }
                    
                    
                }
                found_count++;
            }
            System.out.println("Looped: "+found_count+" times");
            System.out.println("Returning to main menu.");
            System.out.println("***********************************************");
    }

    public static void fibbi_compare(String user)
    {
       String name =user;
        System.out.println("welcome "+name+ " to Fibbi Compare");
        //Build and populate a fibbi array
        
        long[] fib = new long [52];
            for (int k=0;k<fib.length;k++)
            {
            fib[k]=0;
            }
        
        
            int count=1;
            long  number = 51 , answer ,F1=0,F2=1;
        
            while (count<=number)
            
            {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
            } 
            //end of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to find");
        int find = sc.nextInt();
        long compare = 0;
        for (int search=0; search < fib.length; search++)
        {
           if (find == fib[search])
            {
                System.out.println("Whoo!! its a fibonacci Number");
                search=100;
            }
            
            else if (find < fib[search])
            {
                
                System.out.println("closes Fibonacci Number below is "+(fib[search-1]));
                System.out.println("closes Fibonacci Number above is "+fib[search]);
                search=100;
                
            } 
        }
        
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");
    }   
    
    public static void fibbi_add(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi_Add");
        //Build and populate a fibbi array
        
        long[] fib = new long [52];
        for (int k=0;k<fib.length;k++)
        {
        fib[k]=0;
        
        }
            int count=1;
            long  number = 51 , answer ,F1=0,F2=1;
        
            while (count<=number)
            
            {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
            } 
            
            Scanner sc = new Scanner(System.in);
        //gets a number from the user
        System.out.println("Please enter a number to find");
        long find = sc.nextLong();
        
        long found = 0;
        int loop=0;
        System.out.print("The fibonacci numbers that make up "+find+ " are ");
        //loop until the u=find number is 0
        while (loop==0)
        {
        for (int search=0; search < fib.length; search++)
        {
            //if the users number is less than a number in the array
            if (find < fib[search])
            {
                
               //will subtract the users number and the perviuos number in the array
                found = (find - fib[search-1]);
                //displays the number and a +
                System.out.print(fib[search-1]+" + ");
                //makes the new user number the value of found
                find=found;
                //exit for loop
                search=100;
                
            }
           
            if (find==0)
            {
                //display 0 to screen and take a new line
                System.out.print("0 ");
                System.out.println("");
                //exit condition  for the while loop
                loop = 1;
            }
            
        }
        }
        System.out.println("Returning to main menu.");
        System.out.println("***********************************************");  
            
    }

    public static void fibbi_farm(String user)
    {
        String name =user;
        System.out.println("welcome "+name+ " to Fibbi_Farm");
        //Build and populate a fibbi array
        
        int[] fib = new int [13];
        for (int k=0;k<fib.length;k++)
        {
        fib[k]=0;
        
        }
            int count=1;
            int  number = 12 , answer ,F1=0,F2=1;
        
            while (count<=number)
            
            {
             answer = F1+(F2);
             
             F2=F1;
             
             F1=answer;
             
             fib[(count)]= answer;
             
             count++;
            }  
            //generates random numbers
            Random randomNum = new Random();
            //assigns random numbers to the following animals
            int sheep = randomNum.nextInt(10);
            int cow = randomNum.nextInt(10);
            int pig = randomNum.nextInt(10);
            int chicken = randomNum.nextInt(10);
            int goat = randomNum.nextInt(10);
            //adds up the total number of animals
            int total = sheep+cow+pig+chicken+goat;
            System.out.println("Sheep    :" + sheep);
            System.out.println("Cows     :" + cow);
            System.out.println("Pigs     :" + pig);
            System.out.println("Chickens :" + chicken);
            System.out.println("Goats    :" + goat);
            System.out.println("The farm has: "+total+" animals");
    
    
    int total_sold = 0 ;
    //for loop until it finds a number in the array that is bigger than the total
    for (int find = 0; find < fib.length; find++)
                {
                    //if the total number of animals is in the array
                    if (total == fib[find])
                    {
                        find=100;
                        System.out.println("Welcome Fibonacci Farmer");
                        
                    }
                    //if its not then
                   else if (total  < fib[ find ])
                    {
                        //to find the number of animals needing sold
                        total_sold=(total-fib[find-1]);
                        //exit the for loop
                        find=100;  
                     
                    }
                    
                }
            //display the total number of anilmals needing sold
    System.out.println("Total animals needing sold is "+total_sold);
    System.out.println("Returning to main menu.");
    System.out.println("***********************************************");
    }
                
  //end
}
