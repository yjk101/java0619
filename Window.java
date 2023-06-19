package swing3;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {

        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("윈도우");

        /*JButton btn = new JButton();
        btn.setText("버튼1");
        add(btn);

        JButton btn2 = new JButton();
        btn.setText("버튼2");
        add(btn); //버튼 1위에 덧씌워짐

        setVisible(true);*/

    }

    public Window(String title, int width, int height) {

        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(title);

    }

    public void initBorderLayout() {

        //BorderLayout borderLayout = new BorderLayout(10, 10);
        //this.setLayout(borderLayout); <- 기본이 보더레이아웃이라 명시하지 않아도 됨.

        /*JButton btnNorth = new JButton();
        btnNorth.setText("위쪽 버튼");
        add(btnNorth, borderLayout.NORTH);

        JButton btnSouth = new JButton();
        btnNorth.setText("아래쪽 버튼");
        add(btnSouth, borderLayout.SOUTH);

        JButton btnEast = new JButton();
        btnNorth.setText("오른쪽 버튼");
        add(btnEast, borderLayout.EAST);

        JButton btnWest = new JButton();
        btnNorth.setText("왼쪽 버튼");
        add(btnWest, borderLayout.WEST);*/


        String[] layoutTypes = {
                BorderLayout.NORTH,
                BorderLayout.SOUTH,
                BorderLayout.EAST,
                BorderLayout.WEST,
                BorderLayout.CENTER
        };

        for(String type : layoutTypes) {
            JButton btn = new JButton();
            btn.setText(type + "버튼");
            add(btn, type);
        }
        setVisible(true);
    }

    public void initFlowLayout() {

        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT); //디폴트는 .CENTER
        setLayout(flowLayout);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton((i + 1) + " 버튼");
            add(btn);
        }
        setVisible(true);

    }

    public void initGridLayout() {

        //setLayout(new GridLayout(3, 4, 10, 5));
        GridLayout gridLayout = new GridLayout(4, 3);
        setLayout(gridLayout);

        /*for (int i = 0; i < 12; i++) {
            JButton btn = new JButton((i + 1) + " 버튼");
            add(btn);
        }*/

        String[] numbers = {
                "7", "8", "9",
                "4", "5", "6",
                "1", "2", "3",
                "+", "0", "-",
        };

        for (String number : numbers) {
            JButton btn = new JButton(number);
            add(btn);
        }
        setVisible(true);

    }

    public void initBoxLayout() {

        Container container = this.getContentPane();

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.X_AXIS);
        setLayout(boxLayout);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton((i + 1) + " 버튼");
            add(btn);
        }
        setVisible(true);
    }

    public void initLayout() {

        setLayout(null);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton((i + 1) + "버튼");
            btn.setSize(100, 40);
            btn.setLocation(i * 120, i * 10);
            add(btn);
        }

        //JLabel
        //JTextField

        setVisible(true);
    }

    public void initLoginLayout() {

        setLayout(null);

        JLabel idLabel = new JLabel("아이디 : ");
        idLabel.setSize(100,40);
        idLabel.setLocation(10,10);
        idLabel.setHorizontalAlignment(JLabel.CENTER);

        add(idLabel);

        JTextField idText = new JTextField();
        idText.setSize(200,40);
        idText.setLocation(120,10);

        add(idText);

        JLabel passwordLabel = new JLabel("비밀번호 : ");
        passwordLabel.setSize(100,40);
        passwordLabel.setLocation(10,60);

        add(passwordLabel);

        JTextField pwdText = new JTextField();
        pwdText.setSize(200,40);
        pwdText.setLocation(120,60);

        add(pwdText);

        JButton btnLogin = new JButton("로그인");
        btnLogin.setSize(200, 40);
        btnLogin.setLocation(200, 110);
        add(btnLogin);

        setVisible(true);
    }

}
