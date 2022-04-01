import java.util.Arrays;

public class TestFilter implements Filter {

    @Override
    public boolean accept(String x) {
        if(x.length() <= 3){
            return true;
        }
        return false;
    }
}
