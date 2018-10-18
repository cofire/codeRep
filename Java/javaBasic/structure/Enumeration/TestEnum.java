package Enumeration;

public class TestEnum {
    public static void main(String[] args) {
        String monday = DayOFWeekEnum.MONDAY.getCode();
        System.out.println(monday);
        System.out.println(DayOFWeekEnum.MONDAY.getName());
        System.out.println(DayOFWeekEnum.getCodeNameList());
        System.out.println(DayOFWeekEnum.getName("SATURDAY"));
    }
}
