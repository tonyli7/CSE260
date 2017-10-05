import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class WordSort{
  public static void main(String[] args){
    String fileName = args[0];

    ArrayList<String> words = new ArrayList<String>();

    try{
      FileReader fileReader = new FileReader(fileName);

      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String temp = "";
      while(temp != null){
        String[] temp2;
        if (temp != ""){
          temp2 = temp.split("\\s");
          for(String w: temp2){

            if (!w.matches("") && w.matches("[a-zA-Z]+")){
              if (words.size() < 1){
                words.add(w);
              } else if (w.compareTo(words.get(words.size() - 1)) > 0){
                words.add(w);
              } else{
                for (int i = 0; i < words.size(); i++){
                  String higher = words.get(i);
                  if (w.compareTo(higher) <= 0){
                    words.add(i, w);
                    break;
                  }
                }
              }
            }
          }
        }
        System.out.println(temp);
        temp = bufferedReader.readLine();
      }

      bufferedReader.close();
    }

    catch(FileNotFoundException e){
      System.out.println("Unable to open file " + fileName + "");
    }
    catch(IOException e){
      System.out.println("Error reading file " + fileName + "");
    }

    System.out.println(words);
  }



}
