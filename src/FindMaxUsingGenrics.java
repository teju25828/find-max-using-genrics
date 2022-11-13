public class FindMaxUsingGenrics {
    public static void main(String[] args) {

        test((int)500,(int)400,(int)350);
        test((int)500,(int)800,(int)350);
        test((int)500,(int)400,(int)900);

        test((float)500.89,(float)400.50,(float)350.52);
        test((float)500.50,(float)800.25,(float)350.25);
        test((float)500.25,(float)400.26,(float)900.89);



    }

    public static <T extends Comparable> void  test(T object1, T object2, T object3)
    {
        T maximum = object1;

        if(object2.compareTo(maximum)>0)
            maximum=object2;
        else if(object3.compareTo(maximum)>0)
            maximum=object3;
        System.out.println("The largest value from "+object1+" , "+object2+" and "+object3+" is "+maximum);
    }

}
