package strings;

public class String_Builder {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // methods in StringBuilder are same as StringBuffer
        // object.append();
        // obj.insert(position , string);
        // obj.delete(start, end);
        // obj.reverse();
        // obj.toString();
        // obj.length();
        // obj.indexOf(string);
        // obj.lastIndexOf(String);
        // obj.replace(start,end,string);
        // obj.substring(start);
        //obj.substring(start, end);


        // Difference bw StringBuffer and StringBuilder is
        // StringBuffer class is synchronized --> for several threads
        // StringBuilder class is not synchronized --> for single threads

    }
}
