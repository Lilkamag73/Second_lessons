public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7 ;
        var totalWeight = firstBoxer + secondBoxer ;
        System.out.println("Общая масса: " + totalWeight + " кг");
        var weightDifference = firstBoxer - secondBoxer ;
        if (weightDifference < 0) {
            weightDifference = -weightDifference;
        }
        System.out.println("Разница масс: " + weightDifference + " кг");
    }
}