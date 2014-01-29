/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
public class InsertionSort {
     public void insertion_sort_fun(int[] unsorted_array, int len)
    {
      String[] algCode = new String[10];
      algCode[0] =  "INSERTION_SORT (A)";
      algCode[1] =  "1. for k <- 1 to n-1";
      algCode[2] =  "2.    do x <- A[k]";
      algCode[3] =  "3.       i <- k - 1";
      algCode[4] =  "4.       found <- false";
      algCode[5] =  "5.       while (not found) and (i >= 0)";
      algCode[6] =  "6.          do if A[i] > x";
      algCode[7] =  "7.                then exchange A[i+1] <-> A[i]";
      algCode[8] =  "8.                     i <- i - 1";
      algCode[9] =  "9.                else found <- true";
      
      UserInterface2 obj1=new UserInterface2();
      obj1.heading1.setText("Insertion Sort");
      int i;
      String var="";
      for(i=0;i<len;i++)
           { 
             var=var+"  "+unsorted_array[i];
           }
      
      obj1.arr.setText(var);
      String algo=" ";
      for(i=0;i<10;i++)
      {
          
          algo=algo+algCode[i]+"\n";
          obj1.text_algo.setText(convertToMultiline(algCode[i]+"\n"));
      }
      obj1.text_algo.setText(convertToMultiline(algo));
      
     //////////////////////////////////////////////////////////////////////////////////
      String abc="";
      for(i=1;i<len;i++)
      {
          int temp=unsorted_array[i];
          int j;
          for(j=i-1;j>=0 && temp < unsorted_array[j];j--)
              {
                  unsorted_array[j+1]= unsorted_array[j];
              }
          unsorted_array[j+1]=temp;
      }
        for(i=0;i<len;i++)
           { 
             abc=abc+"  "+unsorted_array[i];
           }
        obj1.sorted_text.setText(abc);
    }
    public static String convertToMultiline(String orig)
      {
          return "<html>"+ orig.replaceAll("\n", "<br>")+"</html>";
      }
}
