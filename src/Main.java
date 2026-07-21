public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        //first task
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //second task
        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);

        //third task
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);

        //fourth task
        var friend = 19;
        System.out.println(friend);
        System.out.println(friend + 2);
        System.out.println((friend + 2)/7);

        //fifth task
        var frog = 3.5;
        System.out.println(frog);
        System.out.println(frog * 10);
        System.out.println((frog * 10)/3.5);
        System.out.println((frog * 10)/3.5);
        System.out.println(((frog * 10)/3.5)+4);

        //sixth task
        var firstBoxer = 78.2;
        var secondBoxer = 82.7 ;
        var totalWeight = firstBoxer + secondBoxer ;
        System.out.println("Общая масса: " + totalWeight + " кг");
        var weightDifference = firstBoxer - secondBoxer ;
        if (weightDifference < 0) {
            weightDifference = -weightDifference;
        }
        System.out.println("Разница масс: " + weightDifference + " кг");

        //seventh task
        var diffWeight = secondBoxer % firstBoxer;
        System.out.println(diffWeight);

        //eighth point one task
        var time = 640;
        var timePerChar = 8;
        var result = time / timePerChar;
        System.out.println("Всего в компнаии работает - " + result + " человек");

        //eighth point two task
        var people = time / timePerChar;
        var maxPeople = people + 94;
        var maxTime = maxPeople * timePerChar;
        System.out.println("Если в комании будет работаь " + maxPeople + " человек, то всего " + maxTime + " часов работы может быть поделено между сотрудрниками");
    }
}