/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
public class BubbleSort {
    public void bubble_sort_fun(int[] unsorted_array, int len)
    {
      String[] algCode = new String[10];
      algCode[0] = "BUBBLE_SORT (A)";
      algCode[1] = "1. pass <- 1";
      algCode[2] = "2. sorted <- false";
      algCode[3] = "3. while (not sorted) and (pass < n)";
      algCode[4] = "4.    do sorted <- true";
      algCode[5] = "5.       for i <- 0 to n-pass-1";
      algCode[6] = "6.          do if A[i] > A[i+1]";
      algCode[7] = "7.                then exchange A[i] <-> A[i+1]";
      algCode[8] = "8.                     sorted <- false";
      algCode[9] = "9.       pass <- pass + 1";
      
      UserInterface2 obj1=new UserInterface2();
      obj1.heading1.setText("Bubble Sort");
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
     /////////////////////////////////////////////////////////////////////////////
      int temp,j;
      String abc="";
        for(i=0;i<len;i++)
        {
            for(j=1;j<len-i;j++)
            {
                if(unsorted_array[j-1]>unsorted_array[j])
                {
                    temp=unsorted_array[j-1];
                    unsorted_array[j-1]=unsorted_array[j];
                    unsorted_array[j]=temp;
                }
            }
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

