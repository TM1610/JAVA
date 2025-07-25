public class StringBuffer1{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Tanmay");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" is learning Java.");
        System.out.println(sb);
        sb.deleteCharAt( 4);
        System.out.println(sb);
    }
}