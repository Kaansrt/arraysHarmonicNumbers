public class Main {
    public static void main(String[] args) {
        double[] list = {
                1,2,3,4
        };

        double harmonicNumber = 0;
        for (int i = 0; i < list.length; i++) {
            harmonicNumber += (1/list[i]);
        }
        System.out.println(harmonicNumber);




    }
}