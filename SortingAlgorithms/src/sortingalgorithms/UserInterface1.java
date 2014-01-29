/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Shubham
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class UserInterface1 implements ActionListener {

    /**
     * @param args the command line arguments
     */
    JFrame home1=new JFrame("Sorting Algorithms");
    JPanel master_panel1=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panel3=new JPanel();
    JPanel panel4=new JPanel();
    JLabel label3=new JLabel("Array");
    JTextField array_entry=new JTextField(20);
    JRadioButton user_def=new JRadioButton("user-defined",false);
    JRadioButton pre_def=new JRadioButton("pre-defined",false);
    ButtonGroup group1=new ButtonGroup();
    JButton StartSorting=new JButton("Start");
    String list[]={"Bubble Sort","Combo Sort","Insertion Sort","Tree Sort","Bucket Sort","Counting Sort","Heap Sort","Priority-Queue Sort","Merge Sort","Quick Sort"};
    JComboBox algo_list=new JComboBox(list);
    String text="";
    String res[];
    int unsorted_array[];
   UserInterface1()
   {   
       
       panel2.add(algo_list);
       panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Algorithms"));
      
       
       // making groups for Radio buttons
       group1.add(user_def);
       group1.add(pre_def);
       ////////////////////
       panel1.setLayout(new FlowLayout());
       panel1.add(user_def);
       panel1.add(pre_def);
       panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Array-Type"));
       /////////////////////////////////////////////////////
       master_panel1.setLayout(new GridLayout(1,2));
       master_panel1.add(panel2);
       master_panel1.add(panel1);
       home1.add(master_panel1,BorderLayout.PAGE_START);
       ////////////////////////////////////////////////////////
       panel3.add(label3);
       panel3.add(array_entry);
       home1.add(panel3,BorderLayout.CENTER);
       panel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Array-Data"));
      //////////////////////////////////////////////////////////
       panel4.add(StartSorting);
       StartSorting.addActionListener(this);
       home1.add(panel4,BorderLayout.PAGE_END);
      //////////////////////////////////////////////////////////
       home1.setSize(500, 200);
       home1.setVisible(true);
       home1.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent we){
       System.exit(0);
          }
       });
       
   }
   public void actionPerformed(ActionEvent ae)
   {
       
       if(ae.getSource()==StartSorting)
       {
         int index=algo_list.getSelectedIndex();
         insert_elements();
         switch(index)
         {
             case 0:
                 //Bubble sort
                 
                 BubbleSort obj_bubble=new BubbleSort();
                 obj_bubble.bubble_sort_fun(unsorted_array,res.length);
                 break;
             case 1:
                 
             case 2:
                 //Insertion sort
                 
                 InsertionSort obj_insertion=new InsertionSort();
                 obj_insertion.insertion_sort_fun(unsorted_array,res.length);
                 break;
             case 3:
             case 4:
             case 5:
             case 6:
                 //Heap sort
                  
                 HeapSort obj_heap=new HeapSort();
                 obj_heap.heap_sort_fun();
                 break;
             case 7:
             case 8:
                 //merge Sort
                
                 MergeSort obj_merge=new MergeSort();
                 obj_merge.merge_sort_fun();
                 break;
                 
             case 9:
                 // quick sort
                 
                 QuickSort obj_quick=new QuickSort();
                 obj_quick.quick_sort_fun();
                 break;
         }
       }
   }
   public void insert_elements()
   {
      try
      {
      text=array_entry.getText();
      res=text.split(" ");
      unsorted_array=new int[res.length];
      int i;
      for(i=0;i<res.length;i++)
      {
          unsorted_array[i]=Integer.parseInt(res[i]);
      }
      }
      catch(Exception e)
      {
          
      }
      
   }
    public static void main(String[] args) {
        // TODO code application logic here
        new UserInterface1();
    }
}
