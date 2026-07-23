import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String rev=" ";
        int i;
        for(i=s.length()-1;i>=0;i--)
        rev = rev+s.charAt(i);
        System.out.print(rev);
}
}