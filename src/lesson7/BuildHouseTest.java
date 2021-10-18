package lesson7;

public class BuildHouseTest {
    public static void main(String[] args) {
        House house1 = new House.Builder().hasOngKhoi(true).color("Black").build();
        House house2 = new House.Builder().hasOngKhoi(false).color("white").build();
        House house3 = new House.Builder().build();
        house1.buildHouse();
        house2.buildHouse();
        house3.buildHouse();

    }
}
