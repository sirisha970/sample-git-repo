import java.util.Scanner;
class StringPrint{
  public String getString(){
    String s;
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();    
    return s;
    }
    public void displayString(String a){
      System.out.println(a);
    }
    public static void main(String args[]){
      StringPrint st=new StringPrint();
      String a=st.getString();
      st.displayString(a);
      }
}