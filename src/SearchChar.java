import java.util.*;

public class SearchChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                        //1 - 1
        System.out.println("Nhập chuỗi:");                               //2 - 1
        String string = scanner.nextLine();                              //3 - 1
        char[] charac = new char[string.length()];                       //4 - 1
        for (int i = 0; i < string.length(); i++) {                      //5 - n
            charac[i] = string.charAt(i);                                //6 - 1
        }
        Arrays.sort(charac);                                             //7 - 1
        int count = 1;                                                   //8 - 1
        for (int i = 0; i < charac.length; i++) {                        //9 - n
            if (i == charac.length-1) {                                  //10- 1
                System.out.print(charac[i] + " - " + count);             //11- 1
            }
            else {
                if (charac[i] == charac[i+1]) {                          //12- 1
                    count++;                                             //13- 1
                }
                else {
                    System.out.print(charac[i] + " - " + count + ", ");  //14- 1
                    count = 1;                                           //15- 1
                }
            }
        }
    }
}                                                                        //O(n)
