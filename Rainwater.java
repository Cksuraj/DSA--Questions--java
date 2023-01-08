public class Rainwater {

    // question - claculate the traped raining water int the givan input  

    public static int watercount(int water[]) {
        int leftmax[] = new int[water.length];
        leftmax[0] = water[0];
        for (int i = 1; i < water.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], water[i]);
        }
        int rightmax[] = new int[water.length];
        rightmax[water.length - 1] = water[water.length - 1];
        for (int j = water.length - 2; j >= 0; j--) {
            rightmax[j] = Math.max(water[j], rightmax[j + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < water.length; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += waterlevel - water[i];

        }
        return trapwater;

    }

    public static void main(String[] args) {
        int water[] = { 4,2,0,6,3,2,5 };
        System.out.println(watercount(water));
    }
}