/**
 * author: seungw0n
 * question: Design Parking System
 * details:
 *  Runtime: 8 ms, faster than 72.36% of Java online submissions for Design Parking System.
 *  Memory Usage: 54.7 MB, less than 26.31% of Java online submissions for Design Parking System.
 * comment:
 *  Need to change the filename (Solution.java)
*/

class ParkingSystem {
    private int[] slots;
    
    public ParkingSystem(int big, int medium, int small) {
        slots = new int[3];
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }
    
    public boolean addCar(int carType) {
        if (slots[carType-1] > 0) {
            slots[carType-1] -= 1;
            return true;
        }
        return false;
    }
}
