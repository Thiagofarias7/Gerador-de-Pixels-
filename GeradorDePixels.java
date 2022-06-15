//CriaPixels
import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    Scanner ler = new Scanner(System.in);
    int qtdPixels = 0;
    System.out.println("Digite a quantidade de pixels");
    qtdPixels = ler.nextInt();
    int cnt = 1, cnt1 = 1;
    while(cnt1 <= qtdPixels){
      while(cnt <= qtdPixels){
        System.out.print(" * ");
        cnt++;
        }
      System.out.println("");
      cnt1++;
      cnt = 1;
    }
  
  
  } 
}
