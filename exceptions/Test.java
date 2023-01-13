package exceptions;

public class Test {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }

    //personnalisé

    class SoldeInsuffisantException extends Exception {
        public SoldeInsuffisantException(String message) {
            super(message);
        }
    }
}