public class Model {

  private Viewer viewer;
  private String temp;
  private char action;
  private String leftValue;
  private String rightValue;

  public Model(Viewer viewer) {
    this.viewer = viewer;
    temp = "";
    action = '@';
    leftValue = "";
    rightValue = "";
  }

  public void doAction(String command) {
    if (command.equals("One")) {
        temp = temp + "1";
    } else if (command.equals("Two")) {
        temp = temp + "2";
    } else if (command.equals("Three")) {
        temp = temp + "3";
    } else if (command.equals("Four")) {
        temp = temp + "4";
    } else if (command.equals("Five")) {
        temp = temp + "5";
    } else if (command.equals("Six")) {
        temp = temp + "6";
    } else if (command.equals("Seven")) {
        temp = temp + "7";
    } else if (command.equals("Eight")) {
        temp = temp + "8";
    } else if (command.equals("Nine")) {
        temp = temp + "9";
    } else if (command.equals("Zero")) {
        temp = temp + "0";
    } else if (command.equals(".")) {
        temp = temp + ".";
    } else if (command.equals("Plus")) {
        action = '+';
        leftValue = temp;
        temp = "";
        return;
    } else if (command.equals("Minus")) {
        action = '-';
        leftValue = temp;
        temp = "";
        return;
    } else if (command.equals("Multiply")) {
        action = '*';
        leftValue = temp;
        temp = "";
        return;
    } else if (command.equals("Divide")) {
        action = '/';
        leftValue = temp;
        temp = "";
        return;
    }
    // Обработка скобок
    else if (command.equals("(")) {
        temp = temp + "(";
    } else if (command.equals(")")) {
        temp = temp + ")";
    }
    // Удаление символа
    else if (command.equals("Delete")) {
        if (!temp.isEmpty()) {
            temp = temp.substring(0, temp.length() - 1);
        }
    }
    // Очистка
    else if (command.equals("Clear")) {
        temp = "";
        action = '@';
        leftValue = "";
        rightValue = "";
    }
    // Вычисление
    else if (command.equals("Equal")) {
        rightValue = temp;
        double leftNumber = Double.parseDouble(leftValue);
        double rightNumber = Double.parseDouble(rightValue);
        double answer = 0.0;

        switch (action) {
            case '+':
                answer = leftNumber + rightNumber;
                break;
            case '-':
                answer = leftNumber - rightNumber;
                break;
            case '*':
                answer = leftNumber * rightNumber;
                break;
            case '/':
                answer = leftNumber / rightNumber;
        }

        temp = "" + answer;

        char point = temp.charAt(temp.length() - 2);
        char zero = temp.charAt(temp.length() - 1);
        if ((point == '.') && (zero == '0')) {
            temp = temp.substring(0, temp.indexOf('.'));
        }
      }



    // Обновление представления
    viewer.update(temp);
  }

}
