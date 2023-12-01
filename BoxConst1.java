class Box {
    double side, width, height, depth, vol = 0, vside = 0;

    // Non-parameterised constructor
    public Box() {
        side = 100;
        width = 10;
        height = 10;
        depth = 10;
    }

    // Method to calculate the volume of the box
    public void calc_vol() {
        vside = Math.pow(side, 3);
        vol = width * height * depth;
        System.out.println("\nvolume of the cube is: " + vside);
        System.out.println("\nVolume of the cuboid is: " + vol);
        if (vside > vol) {
            System.out.println("\nThe volume of cube is greater.");
        } else {
            System.out.println("\nThe volume of cuboid is greater.");
        }
    }
}
class BoxConst1 {
    public static void main(String[] args) {
        Box sq = new Box();

        sq.calc_vol();
    }
}
