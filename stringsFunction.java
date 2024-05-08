public class stringsFunction {
    public static void main(String[] args) {
        String str = "Ty.Bsc computer science";
        System.out.println("Default string is : "+str);
        // upper case
        System.out.println("converted string in to upper case : "+str.toUpperCase());
        // Lower case
        System.out.println("converted string in to lower case : "+str.toLowerCase());
        // find length
        System.out.println("length of string : "+str.length());
        // trim function
        String str1 = "  java  ";
        System.out.print("string befor trim : "+str1);
        System.out.print("String after trim : "+str1.trim());
        // charAt function
        System.out.println("Extract character from given index  : "+str.charAt(3));
        // substring
        System.out.println("substring  : "+str.substring(7,15));
        // replace
        System.out.print("String replace 'computer' replace with 'social' : "+str.replace("computer","social"));


    }
    
}
