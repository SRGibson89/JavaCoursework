
package dna_counting;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Steven
 */
public class DNA_Counting {

    
    public static void main(String[] args) 
    {
        int[] seq = new int [27];
        String line ;
        String str = null;
        
        try
        { 
            // finds the file which will have the dna in it
            File myfile = new File("Genetic1.txt");
            FileReader fr =new FileReader(myfile);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("File being used "+ myfile);
            //while the file has something to be read it will keep going
            while ((line = br.readLine())!= null)
            {
                //prints the file out
                System.out.println("dna: "+line);
                str=line;
            }
            
        }
        catch(Exception e)
        {
            //error message if there is a problem reading the file
                  System.out.println("Error reading file");  
        }
    
    for (int k=0;k<seq.length;k++)
    {
        seq[k]=0;
        
    }
    
    for (int k=0; k<str.length();k++)
    {
    int value;
    //looks at the hex value a that part of the file
    value = (int)str.charAt(k);
    //because its in capitals 64 is subtracted to give the letter its array value
    value= (value-64);
        if (value>0)
        {
            seq[value]++;
        }
        else
        {
            seq[0]++;
        }
    }
    
        //shows a message with each of the dna stands
        JOptionPane.showMessageDialog(null,( "Number of each base"+
                                      "\nAdenine:"+ " "+ seq[1]+
                                      "\nCytosine:"+" "+seq[3]+
                                      "\nGuanine:"+" "+seq[7]+
                                      "\nThymine:"+" "+seq[20]));
    
    /**************************************************
    **                Greatest                       **
    **************************************************/    
    //this code will find out with one is the biggest, then shows a message withe biggest number
    if ((seq[1]>seq[3])&&(seq[1]>seq[7])&&(seq[1]>seq[20]))
    {
       JOptionPane.showMessageDialog(null, "Adenine is the greatest with "+seq[1]); 
    }
    else if ((seq[3]>seq[1])&&(seq[3]>seq[7])&&(seq[3]>seq[20]))
    {
        JOptionPane.showMessageDialog(null, "Cytosine is the greatest with "+seq[3]); 
    }
    
    else if ((seq[7]>seq[1])&&(seq[7]>seq[3])&&(seq[7]>seq[20]))
    {
        JOptionPane.showMessageDialog(null, "Guanine is the greatest with "+seq[7]); 
    }
    else if ((seq[20]>seq[1])&&(seq[20]>seq[3])&&(seq[20]>seq[7]))
    {
        JOptionPane.showMessageDialog(null, "Thymine is the greatest with "+seq[20]); 
    }
    /*************************************************
     *                Lowest                         *
    **************************************************/
    if ((seq[1]<seq[3])&&(seq[1]<seq[7])&&(seq[1]<seq[20]))
    {
        JOptionPane.showMessageDialog(null, "Adenine is the lowest with "+seq[1]); 
    }
    else if ((seq[3]<seq[1])&&(seq[3]<seq[7])&&(seq[3]<seq[20]))
    {
        JOptionPane.showMessageDialog(null, "Cytosine is the lowest with "+seq[3]); 
    }
    
    else if ((seq[7]<seq[1])&&(seq[7]<seq[3])&&(seq[7]<seq[20]))
    {
        JOptionPane.showMessageDialog(null, "Guanine is the lowest with "+seq[7]); 
    }
    else if ((seq[20]<seq[1])&&(seq[20]<seq[3])&&(seq[20]<seq[7]))
    {
        JOptionPane.showMessageDialog(null, "Thymine is the Lowest with "+seq[20]); 
    }
   
    /*************************************************
    **                Pattern                        *
    **************************************************/
//      this part search for the following patterns in the data      
    String pattern1 = "ATTTTTC" ;
    String pattern2 = "GAAAGACAGA" ;
    String pattern3 = "TAGGCGT" ;
    String pattern4 = "GTAATAAAG" ;
    
    int offsetpatATTTTTTC,offsetGAAAG,offsetTAG,offsetTAAT;
    
//  
    {
    offsetpatATTTTTTC = str.indexOf(pattern1);
    //if it does not find this pattern
    if ((offsetpatATTTTTTC == -1))
        {
            System.out.println(pattern1 + " is not in the sequence ");
        }
        else 
        {
           //if it does then it show a message box  
            JOptionPane.showMessageDialog(null, pattern1 + " is in the sequence at "+(offsetpatATTTTTTC+1));

            
        }
    //repates the same thing as above
    offsetGAAAG = str.indexOf(pattern2);
    if ((offsetGAAAG == -1))
        {
            System.out.println(pattern2 + " is not in the sequence ");
        }
        else 
        {
            
            JOptionPane.showMessageDialog(null, pattern2 + " is in the sequence at "+(offsetGAAAG+1));

            
        }
    offsetTAG = str.indexOf(pattern3);
    if ((offsetTAG == -1))
        {
            System.out.println(pattern3 + " is not in the sequence ");
        }
        else 
        {
            
            JOptionPane.showMessageDialog(null, pattern3 + " is in the sequence at "+(offsetTAG+1));

            
        }
    offsetTAAT = str.indexOf(pattern4);
    if ((offsetTAAT == -1))
        {
            System.out.println(pattern4 + " is not in the sequence ");
        }
        else 
        {
            
            JOptionPane.showMessageDialog(null, pattern4 + " is in the sequence at "+(offsetTAAT+1));

            
        }
            }
    
    

    }
}
