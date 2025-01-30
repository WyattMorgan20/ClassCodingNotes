package classexample1.pkg2;

public class ClassExample12 {

    public static void main(String[] args) {
        
        Computer comp1 = new Computer("Win", 123, "HP");
        Computer comp2 = new Computer();
        Computer comp3 = new Computer("Lin", 456, "Apple");
        
        comp2.setOS("iOS");
        System.out.println(comp2.getOS());
        
        System.out.println(comp1);
        
        String[] x = new String[3];
        String[] y = {"Bob", "Jane"};
        
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Win", 987, "Intel");
        computers[1] = comp2;
        computers[2] = new Computer("XYZ", 321, "Dell");
        
        Computer[] computers2 = {new Computer("Win", 987, "Intel"), comp2, new Computer("XYZ", 321, "Dell")};
        
        //Enhanced for loop to print the computers in the array
        System.out.println("\nPrinting Computer Array");
        for(Computer s : computers){//Enhanced for loop is not a counting for loop
            System.out.println(s + "\n");
        }
        
    }
    
}
