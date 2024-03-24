//I am learning how to use class in java therefore I used much set and get functions.


import java.util.Scanner;

class plakaSinif{
    private String first;
    private String second;
    private String third;

    public void setFirst(String a){
        first = a;
    }
    public void setSecond(String b){
        second = b;
    }
    public void setThird(String c){
        third = c;
    }

    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;
    }
    public String getThird(){
        return third;
    }

}
public class Main{
    public static void main(String[] args){
        Scanner scnrPlaka = new Scanner(System.in);
        System.out.println("Plaka giriniz: ");
        String Plaka = scnrPlaka.nextLine();


        boolean trplaka = false;

        //splited.
        String[] splitPlaka = Plaka.split("\\s+");

        //Class defined.
        plakaSinif plaka1 = new plakaSinif();

        //Values was defined for variables of the class with the set function.
        plaka1.setFirst(splitPlaka[0]);
        plaka1.setSecond(splitPlaka[1]);
        plaka1.setThird(splitPlaka[2]);

        //new variables.
        String First = plaka1.getFirst();
        String Second = plaka1.getSecond();
        String Third = plaka1.getThird();


        for(char ch: First.toCharArray()){
            if (Character.isLetter(ch)) {
                trplaka = false;
                break;
            }
            else if (Character.isDigit(ch)) {
                trplaka = true;
            }
            if(Integer.parseInt(String.valueOf(ch)) >  81 ) {
                trplaka = false;
                break;
            }
            else if (0 > Integer.parseInt(String.valueOf(ch))){
                trplaka = false;
                break;
            }

        }

        for(char ch: Second.toCharArray()){
            if(trplaka == false) {break;}
            else {
                if (Character.isLetter(ch)) {
                    trplaka = true;
                } else if (Character.isDigit(ch)) {
                    trplaka = false;
                    break;
                }
            }
        }

        for(char ch: Third.toCharArray()){
            if(trplaka == false) {break;}
            else {
                if (Character.isLetter(ch)) {
                    trplaka = false;
                    break;
                } else if (Character.isDigit(ch)) {
                    trplaka = true;
                }
            }
        }

        if (trplaka == true) {
            System.out.println("Plaka Türk plakasıdır.");
        }
        else {
            System.out.println("Plaka Türk plakası değildir.");
        }

    }
}

