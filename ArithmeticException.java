public class ArithmeticException extends RuntimeException{
    public ArithmeticException(int y){
        super("Деление на " + y + " невозможно");
    }
}
