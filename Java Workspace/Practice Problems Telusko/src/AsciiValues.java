public class AsciiValues {
    public static void main(String[] args) {
        //ASCII --> American Standard Code for Information Interchange
        // 7 bits --> Ascii
        // Range(Ascii) --> 2^7 = 128 ----> (0 to 127)
        for(int ascii = 0;ascii <=127;ascii++)
        {
            System.out.printf( " %d  : %c \n",ascii,ascii);
        }
        // A - Z --> 65 to 90
        // a - z --> 97 to 122
        // 0 - 9 --> 48 t0 57
    }
}
