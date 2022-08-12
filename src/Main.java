public class Main {
    public static void main(String[] args) {
        double[] hith = {1.57, 7.654, 9.986};
        double[] io = hith;
        hith[0] = 1.57;
        hith[1] = 7.654;
        hith[2] = 9.986;
        for (int q = 0; q < hith.length; q++) {
            System.out.print(hith[q] + ",");

        }
        //====================
        int[] light = new int[3];
        light[0] = 1;
        light[1] = 2;
        light[2] = 3;
        for (int i = 0; i < light.length; i++) {
            System.out.print(light[i] + ",");
            System.out.println();
            //задача №3
            for (int k = 0; k < light.length / 2; k++) {
                int tmp = light[k];
                light[i] = light[light.length - k - 1];
                light[light.length - k - 1] = tmp;
                System.out.println(light[k]);
                /////////////////
                for (int q = 0; q < hith.length / 2; q++) {
                    double timp = hith[q];
                    hith[q] = hith[light.length - q - 1];
                    hith[hith.length - k - 1] = timp;
                    System.out.println(light[k]);
                }
            }
        }
    }
}