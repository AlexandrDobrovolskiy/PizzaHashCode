import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class Pizza {
    private String[][] pizza;
    private String info;


    public Pizza(String fileName){
        String input = Files.loadFromFile(fileName);
        int index = input.indexOf('\n');
        info = input.substring(0, index);
        String pizzaString = input.substring(index + 1, input.length());
        String[] rows = pizzaString.split("\n");
        pizza = new String[rows.length][];
        for(int i = 0; i < rows.length; i++){
            String[] cols = rows[i].split("");
            pizza[i] = new String[cols.length];
            for (int j = 0; j < cols.length; j++){
                pizza[i][j] = cols[j];
            }
        }
    }


    public static void main(String[] args){
        String EXAMPLE_FILENAME = "C:\\Users\\Alexandr\\Desktop\\Pizza\\big.in";

        
        Pizza example = new Pizza(EXAMPLE_FILENAME);

        //System.out.println(example.info + "\n\n");

        //for (int i = 0; i < example.pizza.length; i++){
        //    for (int j = 0; j < example.pizza[i].length; j++){
        //        System.out.print(example.pizza[i][j]);
        //    }
        //    System.out.println();
        // }

    }
}
