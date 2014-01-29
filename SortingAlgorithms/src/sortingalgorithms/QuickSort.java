/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
public class QuickSort {
    public void quick_sort_fun()
    {
      String[] algCode = new String[18];
      algCode[0]  = "QUICKSORT (A, p, r)";
      algCode[1]  = "1. if p < r";
      algCode[2]  = "2.    then q <- PARTITION (A, p, r)";
      algCode[3]  = "3.         QUICKSORT (A, p, q)";
      algCode[4]  = "4.         QUICKSORT (A, q+1, r)";
      algCode[5]  = "\n";
      algCode[6]  = "PARTITION (A, p, r)";
      algCode[7]  = " 1. piv <- A[p]";
      algCode[8]  = " 2. i <- p - 1";
      algCode[9]  = " 3. j <- r + 1";
      algCode[10] = " 4. while TRUE";
      algCode[11] = " 5.    do repeat j <- j - 1";
      algCode[12] = " 6.       until A[j] <= piv";
      algCode[13] = " 7.       repeat i <- i + 1";
      algCode[14] = " 8.       until A[i] >= piv";
      algCode[15] = " 9.       if i < j";
      algCode[16] = "10.          then exchange A[i] <-> A[j]";
      algCode[17] = "11.          else return j";
      
      UserInterface2 obj1=new UserInterface2();
      obj1.heading1.setText("Quick Sort");
      String algo=" ";
      for(int i=0;i<18;i++)
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
