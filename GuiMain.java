package swing3;

import javax.swing.*;

public class GuiMain {

    public static void main(String[] args) {

        /*//JFrame win = new JFrame();
        Window win = new Window(); //<- 위 코드랑 같은 의미, Window에서 JFrame을 상속받앗기 때문에 JFrame대신 Window 써도 됨.
        win.setSize(1024, 768);
        win.setVisible(true);
        win.setTitle("윈도우"); //창 이름*/

        Window win = new Window();

        //win.initBorderLayout();
        //win.initFlowLayout();
        //win.initGridLayout();
        //win.initBoxLayout();
        //win.initLayout();
        win.initLoginLayout();

    }
}
