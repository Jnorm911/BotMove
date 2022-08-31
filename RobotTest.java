import java.awt.*;

public class RobotTest {

    public static void main(String[] args) {
        Robot ro;
        {
            try {
                ro = new Robot();
                mousePlay(ro, 3440,1440);

            } catch (AWTException e) {
                e.printStackTrace();
            }
        }       
    }       
    

    //
    // Move mouse at coordinates
    //

    public static void mousePlay(Robot r, int X, int Y){
        do{
        r.mouseMove(X, Y);
        r.delay(60000);
        r.delay(60000);
        r.delay(60000);
        r.delay(60000);
        r.delay(50000);
        r.mouseMove(Y, X);
        r.delay(60000);
        r.delay(60000);
        r.delay(60000);
        r.delay(60000);
        r.delay(50000);
        }while(true);
    }
}