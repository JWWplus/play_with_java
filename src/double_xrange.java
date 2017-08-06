
/**
 * Created by jiangweiwei on 17-7-26.
 * 求一个double型的整数次方
 */
public class double_xrange {
    public static void main(String[] args) {
        double_xrange test = new double_xrange();
        System.out.print(test.cal(2.3,14));
    }

    private double cal(double base, int exponent){
        double result = 1.0;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        return result;
    }

    public double power(double base, int exponent) throws Exception{
        if (equal(base, 0.0) && (exponent < 0)) {
            throw new Exception("error, input number wrong");
        }
        if (equal(base, 0.0)) {
            return 1;
        }
        else if (exponent < 0) {
            return cal(1.0/base, -exponent);
        }
        else {
            return cal(base, exponent);
        }
    }

    public boolean equal(double x, double y) {
        if ((x - y < 0.000001) && (x - y > -0.000001)){
            return true;
        }
        else{
            return false;
        }
    }
}
