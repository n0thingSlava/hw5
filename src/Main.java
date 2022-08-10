public class Main {
    public static void main(String[] args) {
        int[] weghts = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weghts[0] = 90;
        int januaryWeghts = weghts[0];
        System.out.println(januaryWeghts);
        System.out.println(weghts[0]);
        System.out.println(weghts[4]);
        int january = 0;
        System.out.println(weghts[january]);
        for (int i = 0; i < weghts.length; i++) {
            System.out.println(weghts[i]);
        }
        int[] light = {1, 2, 3};
        double[] hith = {1.57, 7.654, 9.986};
        hith[0] = 1.57;
        hith[1] = 7.654;
        hith[2] = 9.986;
        for (int q = 0; q < hith.length; q++) {
            System.out.print(hith[q] + ",");
        light[0] = 1;
        light[1] = 2;
        light[2] = 3;
        for (int i = 0; i < light.length; i++) {
             System.out.print(light[i] + ",");

            }


        }
    }
}