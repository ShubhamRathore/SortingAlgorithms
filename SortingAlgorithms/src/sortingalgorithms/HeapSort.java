/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
public class HeapSort {
   public void heap_sort_fun()
    {
      String[] algCode = new String[23];
     algCode[0]  = "HEAPSORT (A)";
      algCode[1]  = "1. BUILD-HEAP (A)";
      algCode[2]  = "2. for k <- length[A] - 1 downto 1";
      algCode[3]  = "3.    do exchange A[0] <-> A[k]";
      algCode[4]  = "4.       heap-size[A] <- heap-size[A] - 1";
      algCode[5]  = "5.       HEAPIFY (A, 0)";
      algCode[6]  = "\n";
      algCode[7]  = "BUILD-HEAP (A)";
      algCode[8]  = "1. heap-size[A] <- length[A]";
      algCode[9]  = "2. for j <- (length[A] div 2) - 1 downto 0";
      algCode[10] = "3.    do HEAPIFY (A, j)";
      algCode[11] = "\n";
      algCode[12] = "HEAPIFY (A, i)";
      algCode[13] = " 1. l = 2 * i + 1";
      algCode[14] = " 2. r = 2 * i + 2";
      algCode[15] = " 3. if l < heap-size[A] and A[l] > A[i]";
      algCode[16] = " 4.    then max <- l";
      algCode[17] = " 5.    else max <- i";
      algCode[18] = " 6. if r < heap-size[A] and A[r] > A[max]";
      algCode[19] = " 7.    then max <- r";
      algCode[20] = " 8. if max <> i";
      algCode[21] = " 9.    then exchange A[i] <-> A[max]";
      algCode[22] = "10.         HEAPIFY (A, max)";

      
      UserInterface2 obj1=new UserInterface2();
      obj1.heading1.setText("Heap Sort");
      String algo=" ";
      for(int i=0;i<23;i++)
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
