import java.util.Scanner;
public class RoxasLinear
{
    public static void main(String[] args)
    {
        int i,index,input;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size:");
        input = s.nextInt();
        int storage[] = new int [input];
        String display = "";
               
        for(i = 0;i<input;i++)
        {
            System.out.print("Enter a value to input in array["+i+"]: ");
            storage[i] = s.nextInt();
            display+=storage[i]+" ";
        }
        
        System.out.println("List: "+display);
        System.out.print("Enter the value to be located: ");
        index = s.nextInt();

        for(i = 0; i<input;i++)
        {
            if(storage[i] == index)
            {
                System.out.println(index+" is located at " +i);
                break;
            }
        }
      
        if (i == input)
        {
            System.out.println(index+" is not in the list.");
        }
    }
}
