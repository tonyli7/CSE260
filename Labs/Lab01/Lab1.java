import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Lab1{
  public static void main (String[] args){
    System.out.println("==============Testing Print Distinct Nums================\n\n");
    distinctify();

    System.out.println("\n==============Testing Time Execution================\n\n");
    searchTest();

    System.out.println("\n==============Testing Tic Tac Toe================\n\n");
    ttt();

    System.out.println("\n==============Testing Collatz================\n\n");
    System.out.println("\n" + collatz(10));
    System.out.println("\n" + collatz(100));
    System.out.println("\n" + collatz(53));


  }

  public static void distinctify(){
    int[] nums = new int[10];
    int index = 0;
    boolean contains_0 = false;
    Scanner reader = new Scanner(System.in);
    for (int i = 0; i < 10; i++){
      int input = reader.nextInt();
      if (input == 0 && !contains_0){
        index++;
        contains_0 = true;
      }
      if (!in(nums, input)){
        nums[index] = input;
        index++;
      }
    }
    System.out.print("Distinct: ");
    for (int i = 0; i < index; i++){

      System.out.print(nums[i] + " ");
    }
  }

  public static boolean in(int[] arr, int num){

    for (int i: arr){
        if (num == i){
          return true;
        }
    }
    return false;
  }

  public static void searchTest(){
    int[] arr = new int[100000];
    Random rand = new Random();
    int randIndex = rand.nextInt(100000);
    int key = 0;
    for(int i = 0; i < 100000; i++){
      int n = rand.nextInt();
      arr[i] = n;
      if (i == randIndex){
        key = n;
      }
    }

    //==============Linear Search====================
    long startTime = System.currentTimeMillis();
    for(int i: arr){
      if (key == i){
        System.out.println("GOTTI");
        break;
      }
    }
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Linear Search: " + executionTime);


    //===========Binary Search======================
    Arrays.sort(arr);
    startTime = System.currentTimeMillis();
    int start = 0;
    int end = 99999;
    while (end >= start){

      int mid = (start + end) / 2;
      if (arr[mid] == key){
        System.out.println("GOTTI");
        break;

      }else if (arr[mid] > key){
        end = mid - 1;
      }else if (arr[mid] < key){
        start = mid + 1;
      }
    }

    endTime = System.currentTimeMillis();
    executionTime = endTime - startTime;
    System.out.println("Binary Search: " + executionTime);
  }

  public static void ttt(){
    int turn = 0;

    String[][] board = new String[3][3];
    String p1 = "X";
    String p2 = "O";

    display(board);
    while(turn < 9){
      Scanner reader = new Scanner(System.in);
      int x = reader.nextInt();
      int y = reader.nextInt();

      if (turn % 2 == 0 && board[x][y] == null){
        board[x][y] = p1;
      } else if (turn % 2 == 1 && board[x][y] == null){
        board[x][y] = p2;
      }

      display(board);

      if (hasWon(p1, board)){
        System.out.println("X has won!");
        break;
      }
      if (hasWon(p2, board)){
        System.out.println("O has won!");
        break;
      }
      turn++;
      if (turn == 9){
        System.out.println("It's a tie!");
      }
    }

  }

  public static boolean hasWon(String player, String[][] board){
    for (int i = 0; i < 3; i++){
      if (player == board[i][0] && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
        return true;
      }
      if (player == board[0][i] && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
        return true;
      }
    }

    if (player == board[0][0] && board[0][0] == board[1][1] && board[1][1] == board[2][2]){
      return true;
    }
    if (player == board[0][2] && board[0][2] == board[1][1] && board[1][1] == board[2][0]){
      return true;
    }
    return false;
  }

  public static void display(String[][] board){
    String ss = "";
    for(String[] row: board){
      for(String s: row){
        if(s == null){
          ss += "_ ";
        }else{
          ss += s + " ";
        }
      }
      ss += "\n";
    }
    System.out.println(ss);
  }

  public static int collatz(int n){
    int iterations = 0;
    while (n != 1){
      System.out.print(n + " ");
      if (n % 2 == 0){
        n = n / 2;
      }else{
        n = 3 * n + 1;
      }
      iterations++;
    }
    return iterations;
  }


}
