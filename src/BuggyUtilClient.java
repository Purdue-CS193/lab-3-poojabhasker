
public class BuggyUtilClient {
    public static void main(String[] args) {
        // First test case in Main
        System.out.println("Example 1: Make My Username");
        System.out.println("In: first = " + "\"Sean\"" +
                ", last = " + "\"Flannery\"");
        System.out.println("Out: " +
        StringUtils.makePurdueUsername("bo", "xiu"));
        String res = "bo".substring(0,1)+"Flannery";
        String temp = res.substring(0, 8);
        String out = temp.toLowerCase();
        System.out.println(out);

    }
}



