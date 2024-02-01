public class PrintLetters{
    public static void printLetter(String fullName){
        for(int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String fullname = "tONY STARK";
        printLetter(fullname);
    }
}