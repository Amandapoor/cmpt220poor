//Amanda Poor
//Prof. Arias
//Software Development 1

//promts the user to enter a string and the delimiters found in the string and 
//displays the new strings separated by a space


import java.util.*;


public class hw8Problem1 {

    public static ArrayList<String> split(String s,String delimiters){
        //stores the input of the string
        ArrayList<String> s2 = new ArrayList<String>(); 
        //length of string input
        int n = s.length(); 
        //number of delimiters
        int m = delimiters.length(); 

        //breaks string as character
        String xn="";
        for(int i=0;i<n;i++){
            boolean found = false; // true if delimiters found
            for(int j=0;j<m;j++){
                if(s.charAt(i)==delimiters.charAt(j)){
                    found = true;
                    break;
                }
            }
            //if delimiters add to result
            if(found){ //if delimiters found add to result
                s2.add(xn);
                xn = " ";
            //else add the current character to string
            } else{ 
                xn = xn + "" + s.charAt(i);
            }
        }
        //add character xn to new string
        if(!xn.equals("")){ 
            s2.add(xn);
        }
        return s2;
    }
    //main method for asking for user input and returning output
    public static void main(String[] args) {
        //testing the given method
        Scanner input = new Scanner(System.in);

        //prompts user to enter a string, calls it s
        System.out.print("Enter string: ");
        String s = input.nextLine();

        //prompts user to enter delimiters and calls it delimiters
        System.out.print("Enter delimiters: ");
        String delimiters = input.nextLine();
        

        //prints the characters in vector without delimiters
        System.out.println(split(s,delimiters));

        

    }
}
