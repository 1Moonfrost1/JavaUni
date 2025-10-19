public class Ex4_4 {

    private String s1;
    private String s2;

    public Ex4_4(String cuv1, String cuv2)
    {
        s1 = cuv1;
        s2 = cuv2;
    }

    public void concat()
    {
        System.out.println(s1 + s2);
    }

    public void equalOperator()
    {
        System.out.println(s1 == s2);
    }

    public void equals()
    {
        System.out.println(s1.equals(s2));
    }
}
