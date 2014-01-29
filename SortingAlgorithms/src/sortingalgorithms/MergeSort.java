/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
public class MergeSort {
     public void merge_sort_fun()
    {
      String[] algCode = new String[15];
      algCode[0]  = "MERGESORT (A, lo, hi)";
      algCode[1]  = " 1. if lo < hi then";
      algCode[2]  = " 2.    mid = (lo + hi) / 2";
      algCode[3]  = " 3.    MERGESORT (A, lo, mid)";
      algCode[4]  = " 4.    MERGESORT (A, mid+1, hi)";
      algCode[5]  = " 5.    L = lo";
      algCode[6]  = " 6.    H = mid + 1";
      algCode[7]  = " 7.    for k <- lo to hi";
      algCode[8]  = " 8.       do if L <= mid and (H > hi or A[L] < A[H])";
      algCode[9]  = " 9.             then scratch[k] = A[L]";
      algCode[10] = "10.                  L <- L + 1";
      algCode[11] = "11.             else scratch[k] = A[H]";
      algCode[12] = "12.                  H <- H + 1";
      algCode[13] = "13.    for k <- lo to hi";
      algCode[14] = "14.       do A[k] <- scratch[k]";
      
      UserInterface2 obj1=new UserInterface2();
      obj1.heading1.setText("Merge Sort");
      String algo=" ";
      for(int i=0;i<15;i++)
      {
          
          algo=algo+algCode[i]+"\n";
          obj1.text_algo.setText(convertToMultiline(algCode[i]+"\n"));
      }
      obj1.text_algo.setText(convertToMultiline(algo));
    }
    public static String convertToMultiline(String orig)
      {
          return "<html>"+ orig.replaceAll("\n", "<br>")+"</html>";
      }
    
}
