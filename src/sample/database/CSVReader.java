package sample.database;
import java.io. * ;
import java.util.Scanner;
import java.util.Vector;

public class CSVReader {

    public CSVReader() {
    }

    public void CSVReaderMethod(){

    String fileName = "C:\\Users\\BATOOL\\IdeaProjects\\gadiet\\src\\sample\\database\\ABBREV_75.csv";
    File file = new File(fileName);

    try{
    Scanner inputStream = new Scanner(file);
        System.out.print("iauahowiefjoeijfo");

        int i = 0;
    Vector<String> ingredients = new Vector<>();
    while (inputStream.hasNext()) {

        System.out.print("iauahowiefjoeijfo");

        /*
        String data = sc.next();
        String[] values = data.split(",");
        System.out.println(data);
        */
        String ingredient = inputStream.next();
        ingredients.add(i,ingredient);
        System.out.print("iauahowiefjoeijfo");


        System.out.print(ingredients.get(i));
    }


        inputStream.close();
    }catch(FileNotFoundException e){
    e.printStackTrace();
    }


    }






}



