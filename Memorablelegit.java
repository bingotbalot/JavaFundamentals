import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.InputMap;
public class Memorablelegit{
    public static void main(String[] args)throws IOException {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("Author1, Cate1,First");
        list.add("Author2, Cate2,Second");
        list.add("Author3, Cate3,Third");
        FileWriter myWriter = new FileWriter("C:/Users/Shark's/Desktop/Java/quotes.txt");
        ArrayList<String> list1 = new ArrayList<String>();
        String input="";Scanner scan = new Scanner(System.in);
        String inn;
        
       do{
        System.out.println();
        System.out.println("---MENU---");
        System.out.println("--random--");
        System.out.println("----all---");
        System.out.println("--search--");
        System.out.println("--csearch-");
        System.out.println("--display-");
        System.out.println("----add---");
        System.out.println("--remove--");
        System.out.print("Select: ");
        inn = scan.nextLine();
        
    
        switch(inn) {
            case "random","Random":
            File myObj = new File("C:/Users/Shark's/Desktop/Java/quotes.txt");
                System.out.println("--Random--");
                int randomIndex = (int)(Math.random()*list.size());
                System.out.println("Random Quote = " + list.get(randomIndex));
                break;
            
            case "all","All": 
            System.out.println("--All--");
            try {
                File myObj1 = new File("C:/Users/Shark's/Desktop/Java/quotes.txt");
                Scanner myReader = new Scanner(myObj1);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  System.out.println(data);
                }
                myReader.close();
              } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            break;
            
            case "search","Search": 
            File myObj2 = new File("C:/Users/Shark's/Desktop/Java/quotes.txt");
                System.out.println("Search reference:");
                String title = scan.nextLine();
                int total = 0;
                for (String i: list)
                {
                    if(i.contains(title))
                    {
                        System.out.println(i);
                        total++;
                    }
                }
                System.out.print("Total matches found: " + total);
                break;
            
            case "csearch","Csearch": 
            File myObj3 = new File("C:/Users/Shark's/Desktop/Java/quotes.txt");
                System.out.println("Search content:");
                String content = scan.nextLine();
                int num = 0;
                for (String i: list)
                {
                    if(i.contains(content))
                    {
                        System.out.println(i);
                        num++;
                    }
                }
                System.out.print("Total matches found: " + num);
                break;
            
            case "display","Display":
                System.out.println("indicate delay (s):");
                int delay = scan.nextInt();
                System.out.println("indicate maximum:");
                int max = scan.nextInt();
                
                for (int i = 0; i <= list.size(); i++)
                {
                    if(list1.size() <= max-1){
                        list1.add(list.get(i));
                        System.out.println(list1); 
                        }
                    try{
                        Thread.sleep(delay);
                      }catch(InterruptedException ex){}
                
                        
                }
                break;
           
            case "add" , "Add":
            try { 
                    FileWriter myWriter1 = new FileWriter("C:/Users/Shark's/Desktop/Java/quotes.txt");
                    System.out.println("Add a qoute: ");
                    input= scan.nextLine();
                    list.add(input);
                    input = list.toString();
                    for(int x=0;list.size()>x;x++){
                        System.out.println(list.get(x)); }
                    myWriter1.write(input);
                    myWriter1.flush();
                    System.out.println(list);
                    System.out.println("Successfully wrote to the file.");                  
                               
                    }
                    
                    catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();}
                        
                        
                break;
            
            case "remove" , "Remove":
            try { 
            FileWriter myWriter3 = new FileWriter("C:/Users/Shark's/Desktop/Java/quotes.txt");
            System.out.println("Remove a qoute: ");
            input = scan.nextLine();
            list.remove(input);
            input = list.toString();
            for(int x=0;list.size()>x;x++){
                System.out.println(list.get(x)); }     
                System.out.println(list);
                System.out.println("Successfully remove to the file.");
            }
            catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();}
            
                    
                    
            break;
                    
                


       }


    }while (true);
}
}


