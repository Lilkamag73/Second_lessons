public class Main {
    public static void main(String[] args) {
        var time = 640;
        var timePerChar = 8;
        var people = time / timePerChar;
        var maxPeople = people + 94;
        var maxTime = maxPeople * timePerChar;
        System.out.println("Если в комании будет работаь " + maxPeople + " человек, то всего " + maxTime + " часов работы может быть поделено между сотрудрниками");
    }
}