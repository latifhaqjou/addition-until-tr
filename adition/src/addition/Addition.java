package addition;
import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        Random or=new Random();
        int x=or.nextInt(100);
        int y=or.nextInt(100);
        int res=x+y;
        System.out.println("solve this problem.");
        System.out.print(x+" + "+y+"  =");
        
        for(x=1;x>=1;x++){
            int sum=os.nextInt();
        if(sum!=res){System.out.println("try again ");}
        if (sum==res){
            System.out.println(sum+" is the corect answer");
        break;}}   
    }

}
