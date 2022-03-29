import java.util.Arrays;

public interface Filter {
    boolean accept(String x);

        public static String[] filter(String[] a, Filter f) {
            String[] retArr = new String[a.length];
            int acceptedString = 0;
            for (int i = 0; i < a.length; i++) {
                if (f.accept(a[i])) {
                    retArr[acceptedString] = a[i];
                    acceptedString++;
                }
            }
            int spot = 0;
            String[] returnArr = new String[acceptedString];
            for (int i = 0; i < a.length; i++) {
                if (f.accept(a[i])) {
                    returnArr[spot++] = a[i];

                }

            }
            return returnArr;
        }
    }


/*class FilterImplementation implements Filter{
    public boolean accept(String x){
        if(x.length() <= 3){
            return true;
        }
        return false;
   */


