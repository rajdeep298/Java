package rajdeep;

import java.io.PrintWriter;

class listOfNumbers{
    private int[] list={5,6,8,9,2};

    public void writelist(){
        PrintWriter out=null;

        try{
            System.out.println("Process the list.");

            // create/open the file
            out=new PrintWriter("OutFile.txt");

            //write the list to the file
            for(int i=0;i<7;i++){
                out.println("Value at: "+i+" = "+list[i]);
            }
        }//end of try
        catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
//        catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException: "+e.getMessage());
//        }//end of catch
        finally {
            if(out!=null){
                System.out.println("Closing PrintWriter.");
                out.close();
            }
            else{
                System.out.println("PrintWriter not open.");
            }
        }
    }
}
public class Exception1_Try_Catch_Finally {
    public static void main(String[] args) {
        listOfNumbers l=new listOfNumbers();
        l.writelist();
    }
}
