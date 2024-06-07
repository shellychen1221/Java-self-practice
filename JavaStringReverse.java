//red team

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A = scanner.nextLine();//Scan the String
        String[] k = new String[A.length()];//Declare the array
        String[] l = new String[A.length()];
        for (int i = 0; i < A.length(); i++) {
            k[i] = A.substring(i, (i+1));//Returns the string from beginIndex to endIndex
            l[i] = A.substring(i, (i+1));
        }
        String kk=k[0];
        if(A.length()==1){
            k[0]=kk;
        }
        //Reverse the String
        else{
            for(int i=0;i<=A.length()-2;i++){
                k[i]=l[A.length()-1-i];
            }
            k[A.length()-1]=kk;
        }
        scanner.close();
        //Check if the reverse array equal to the previous array
        if(Arrays.equals(k,l)){
            
            System.out.println("Yes");//Output the result
        }
        else{
            
            System.out.println("No");//Output the result
        }

    }
    }
