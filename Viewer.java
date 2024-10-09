import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
public class Viewer {

  private JTextField textField;
  public Viewer() {
    Controller controller = new Controller(this);

    Font fontTextField = new Font("Verdana", Font.PLAIN, 25);
    textField = new JTextField();
    textField.setBounds(20, 50, 460, 50);
    textField.setFont(fontTextField);
    textField.setForeground(Color.BLACK);
    textField.setHorizontalAlignment(JTextField.RIGHT);

    Font font = new Font("Verdana", Font.PLAIN, 25);

    JButton buttonOne = new JButton("1");
    buttonOne.setBounds(20, 120, 107, 60);
    buttonOne.setFont(font);
    buttonOne.setForeground(Color.BLACK);
    buttonOne.setBackground(Color.LIGHT_GRAY);
    buttonOne.addActionListener(controller);
    buttonOne.setActionCommand("One");

    JButton buttonTwo = new JButton("2");
    buttonTwo.setBounds(137, 120, 107, 60);
    buttonTwo.setFont(font);
    buttonTwo.setForeground(Color.BLACK);
    buttonTwo.setBackground(Color.LIGHT_GRAY);
    buttonTwo.addActionListener(controller);
    buttonTwo.setActionCommand("Two");
    //
    JButton buttonThree = new JButton("3");
    buttonThree.setBounds(254, 120, 107, 60);
    buttonThree.setFont(font);
    buttonThree.setForeground(Color.BLACK);
    buttonThree.setBackground(Color.LIGHT_GRAY);
    buttonThree.addActionListener(controller);
    buttonThree.setActionCommand("Three");

    JButton buttonFour = new JButton("4");
    buttonFour.setBounds(20, 190, 107, 60);
    buttonFour.setFont(font);
    buttonFour.setForeground(Color.BLACK);
    buttonFour.setBackground(Color.LIGHT_GRAY);
    buttonFour.addActionListener(controller);
    buttonFour.setActionCommand("Four");

    JButton buttonFive = new JButton("5");
    buttonFive.setBounds(137, 190, 107, 60);
    buttonFive.setFont(font);
    buttonFive.setForeground(Color.BLACK);
    buttonFive.setBackground(Color.LIGHT_GRAY);
    buttonFive.addActionListener(controller);
    buttonFive.setActionCommand("Five");

    JButton buttonSix = new JButton("6");
    buttonSix.setBounds(254, 190, 107, 60);
    buttonSix.setFont(font);
    buttonSix.setForeground(Color.BLACK);
    buttonSix.setBackground(Color.LIGHT_GRAY);
    buttonSix.addActionListener(controller);
    buttonSix.setActionCommand("Six");

    JButton buttonSeven = new JButton("7");
    buttonSeven.setBounds(20, 260, 107, 60);
    buttonSeven.setFont(font);
    buttonSeven.setForeground(Color.BLACK);
    buttonSeven.setBackground(Color.LIGHT_GRAY);
    buttonSeven.addActionListener(controller);
    buttonSeven.setActionCommand("Seven");

    JButton buttonEight = new JButton("8");
    buttonEight.setBounds(137, 260, 107, 60);
    buttonEight.setFont(font);
    buttonEight.setForeground(Color.BLACK);
    buttonEight.setBackground(Color.LIGHT_GRAY);
    buttonEight.addActionListener(controller);
    buttonEight.setActionCommand("Eight");

    JButton buttonNine = new JButton("9");
    buttonNine.setBounds(254, 260, 107, 60);
    buttonNine.setFont(font);
    buttonNine.setForeground(Color.BLACK);
    buttonNine.setBackground(Color.LIGHT_GRAY);
    buttonNine.addActionListener(controller);
    buttonNine.setActionCommand("Nine");

    JButton buttonOpenBracket = new JButton("(");
    buttonOpenBracket.setBounds(20, 330, 107, 60);
    buttonOpenBracket.setFont(font);
    buttonOpenBracket.setForeground(Color.BLACK);
    buttonOpenBracket.setBackground(Color.LIGHT_GRAY);
    buttonOpenBracket.addActionListener(controller);
    buttonOpenBracket.setActionCommand("(");

    JButton buttonZero = new JButton("0");
    buttonZero.setBounds(137, 330, 107, 60);
    buttonZero.setFont(font);
    buttonZero.setForeground(Color.BLACK);
    buttonZero.setBackground(Color.LIGHT_GRAY);
    buttonZero.addActionListener(controller);
    buttonZero.setActionCommand("Zero");

    JButton buttonCloseBracket = new JButton(")");
    buttonCloseBracket.setBounds(254, 330, 107, 60);
    buttonCloseBracket.setFont(font);
    buttonCloseBracket.setForeground(Color.BLACK);
    buttonCloseBracket.setBackground(Color.LIGHT_GRAY);
    buttonCloseBracket.addActionListener(controller);
    buttonCloseBracket.setActionCommand(")");

    JButton buttonDot = new JButton(".");
    buttonDot.setBounds(20, 400, 107, 60);
    buttonDot.setFont(font);
    buttonDot.setForeground(Color.BLACK);
    buttonDot.addActionListener(controller);
    buttonDot.setActionCommand(".");

    JButton buttonClear = new JButton("C");
    buttonClear.setBounds(137, 400, 107, 60);
    buttonClear.setFont(font);
    buttonClear.setForeground(Color.RED);
    buttonClear.addActionListener(controller);
    buttonClear.setActionCommand("Clear");

    JButton buttonDelete = new JButton("←");
    buttonDelete.setBounds(254, 400, 107, 60);
    buttonDelete.setFont(font);
    buttonDelete.setForeground(Color.RED);
    buttonDelete.addActionListener(controller);
    buttonDelete.setActionCommand("Delete");


    JButton buttonPlus = new JButton("+");
    buttonPlus.setBounds(373, 120, 107, 60);
    buttonPlus.setFont(font);
    buttonPlus.setForeground(Color.BLACK);
    buttonPlus.addActionListener(controller);
    buttonPlus.setActionCommand("Plus");
    //
    JButton buttonMinus = new JButton("-");
    buttonMinus.setBounds(373, 190, 107, 60);
    buttonMinus.setFont(font);
    buttonMinus.setForeground(Color.BLACK);
    buttonMinus.addActionListener(controller);
    buttonMinus.setActionCommand("Minus");

    JButton buttonMultiply = new JButton("*");
    buttonMultiply.setBounds(373, 260, 107, 60);
    buttonMultiply.setFont(font);
    buttonMultiply.setForeground(Color.BLACK);
    buttonMultiply.addActionListener(controller);
    buttonMultiply.setActionCommand("Multiply");

    JButton buttonDivide = new JButton("/");
    buttonDivide.setBounds(373, 330, 107, 60);
    buttonDivide.setFont(font);
    buttonDivide.setForeground(Color.BLACK);
    buttonDivide.addActionListener(controller);
    buttonDivide.setActionCommand("Divide");

    JButton buttonEqual = new JButton("=");
    buttonEqual.setBounds(373, 400, 107, 60);
    buttonEqual.setFont(font);
    buttonEqual.setForeground(Color.BLACK);
    buttonEqual.addActionListener(controller);
    buttonEqual.setActionCommand("Equal");

    JFrame frame = new JFrame("Calculator MVC Pattern with RPN");
    frame.setSize(500, 700);
    frame.setLayout(null);
    frame.getContentPane().setBackground(new Color(50, 50, 50)); // Тёмный цвет
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(textField);
    frame.add(buttonOne);
    frame.add(buttonTwo);
    frame.add(buttonThree);
    frame.add(buttonFour);
    frame.add(buttonFive);
    frame.add(buttonSix);
    frame.add(buttonSeven);
    frame.add(buttonEight);
    frame.add(buttonNine);
    frame.add(buttonOpenBracket);
    frame.add(buttonZero);
    frame.add(buttonCloseBracket);
    frame.add(buttonDot);
    frame.add(buttonClear);
    frame.add(buttonDelete);
    frame.add(buttonPlus);
    frame.add(buttonMinus);
    frame.add(buttonMultiply);
    frame.add(buttonDivide);
    frame.add(buttonEqual);


    frame.setLocation(700, 200);
    frame.setVisible(true);
  }

  public void update(String value){
    textField.setText(value);
  }
}
