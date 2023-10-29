public class Leetcode1603 {
    class ParkingSystem {
        int[] space = new int[3];

        public ParkingSystem(int big, int medium, int small) {
            space[0] = big;
            space[1] = medium;
            space[2] = small;
        }

        public boolean addCar(int carType) {
            if (space[carType - 1] > 0) {
                space[carType - 1]--;
                return true;
            } else {
                return false;
            }
        }
    }
}
