public class SwitchCase {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 0 :
                System.out.println("Zero");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 6 :
                System.out.println("Six");
                break;
            case 7 :
                System.out.println("Seven");
                break;
            //Default case will print when the given num is no present in cases it will print default value
            default :
                System.out.println("Given number not in the list");
                break;
        }
        String j = "Hell";
        switch (j)
        {
            case "Hello":
                System.out.println("Hello");
                break;
            case "Hi":
                System.out.println("Hi");
                break;
            default:
                System.out.println("Null");
        }
    }
}
