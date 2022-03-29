import java.util.Arrays;

public class TestFilter implements Filter {
    public static void main(String[] args) {

        TestFilter test = new TestFilter();

       // Filter f = new FilterImplementation();

        //
        String arr[] = {"hej","mattias","tor","är","penis"};



        //filter
        arr =Filter.filter(arr,test);
        System.out.println("Filterd"+ Arrays.toString(arr));

    }

    @Override
    public boolean accept(String x) {
        if(x.length() <= 3){
            return true;
        }
        return false;

    }
}
