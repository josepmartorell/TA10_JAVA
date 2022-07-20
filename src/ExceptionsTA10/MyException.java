package ExceptionsTA10;

public class MyException extends Exception{

    private String keyCode;
    private String message;

    public MyException(String keyCode) {

        switch (keyCode) {
        case "1":
            message = "the number is odd";
            break;
        case "2":
            message = "the number is even";
            break;
        }
    }

    public String getMessage() {
        return "with key code: " + keyCode + ", the following message has been generated " + message;
    }
}