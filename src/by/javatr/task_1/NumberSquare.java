package by.javatr.task_1;

public class NumberSquare {

    public static int m(int number) {
        int variable = number % 10;
        int result;
        switch (variable) {
            case 1:
            case 9:
                result = 1;
                break;
            case 2:
            case 8:
                result = 4;
                break;
            case 3:
            case 7:
                result = 9;
                break;
            case 4:
            case 6:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
                default:
                    result = 0;
        }
        return result;
    }
}
