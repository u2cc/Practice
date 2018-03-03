import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calculator {
    public static void main(String[] args){

        System.out.print(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
    }
}
