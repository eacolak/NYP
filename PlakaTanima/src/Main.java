import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scnrPlaka = new Scanner(System.in);
        System.out.println("Plaka giriniz: ");
        String Plaka = scnrPlaka.nextLine();

        boolean trplaka = false;

        String[] splitPlaka = Plaka.split("\\s+");


        for(char ch: splitPlaka[0].toCharArray()){
            if (Character.isLetter(ch)) {
                trplaka = false;
                break;
            }
            else if (Character.isDigit(ch)) {
                trplaka = true;
            }
            if(Integer.parseInt(splitPlaka[0]) >  81 ) {
                trplaka = false;
                break;
            }
            else if (0 > Integer.parseInt(splitPlaka[0])){
                trplaka = false;
                break;
            }

        }

        for(char ch: splitPlaka[1].toCharArray()){
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

        for(char ch: splitPlaka[2].toCharArray()){
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

