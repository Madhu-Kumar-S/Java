package hacker_rank;



public class EncryptionDecryption {
    static  String encPass(String password)
    {
        char[] arr = password.toCharArray();
        char[] asciiArr = new char[password.length()];
        for(int i=0;i<arr.length;i++)
        {
            int ascii = arr[i];
            ascii++;
            char c = (char) ascii;
            asciiArr[i] = c;
        }
        String res = new String(asciiArr);
        return res;
    }
    static String decPass(String encPassword)
    {
        char[] arr = encPassword.toCharArray();
        char[] asciiArr = new char[encPassword.length()];
        for(int i=0;i<arr.length;i++)
        {
            int ascii = arr[i];
            ascii--;
            char c = (char) ascii;
            asciiArr[i] = c;
        }
        String res = new String(asciiArr);
        return res;

    }
    public static  void main(String[] args)
    {
        String encryptedPassword = EncryptionDecryption.encPass("abc123");
        System.out.println(encryptedPassword);
        String decryptedPassword = EncryptionDecryption.decPass(encryptedPassword);
        System.out.println(decryptedPassword);
    }
}
