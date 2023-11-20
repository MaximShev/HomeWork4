public class Main {
    public static void main(String[] args) {
/// Задача 1
    int age = 13;
    if (age >= 18) {
        System.out.println("Вы достигли совершеннолетия");
    } else {
        System.out.println("Вы не достигли совершеннолетия, нужно немного подождать");
    }
/// Задача 2
    float temperature = 4.6f;
    if (temperature <= 5) {
        System.out.println("На улице " + temperature + " градусов, нужно одеть шапку");
    } else {
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
    }
/// Задача 3
    float speed = 67.3f;
    if (speed >= 60) {
        System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
    } else {
        System.out.println("Если скорость " + speed + " км/ч, то вы соблюдаете скоростной режим, штраф не будет");
    }
/// Задача 4
    int age1 = 25;
    if (age1 >= 2 && age1 <= 6) {
        System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
    } else if (age1 >= 7 && age1 <= 17) {
        System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
    } else if (age1 >= 18 && age1 <= 24) {
        System.out.println("Если возраст человека равен " + age1 + ", то его место в университете");
    } else if (age1 > 24) {
        System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
    }
/// Задача5
    int ageChild = 14;
    if (ageChild < 5) {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то нельзя кататься на аттракционе");
    } else if (ageChild >= 5 && ageChild < 14) {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе в сопровождении взрослого");
    } else if (ageChild >= 14) {
        System.out.println("Если возраст ребенка равен " + ageChild + ", то можно кататься на аттракционе без сопровождения взрослого");
    }
/// Задача 6
    int placeInTheCarriage = 102;
    int placeSeat = 60;
    int placeOccupied = 50;
    if (placeOccupied < placeSeat) {
        System.out.println("В вагоне занято " + placeOccupied + " мест, вы можете занять сидячее место");
    } else if (placeOccupied >= placeSeat && placeOccupied < placeInTheCarriage) {
        System.out.println("В вагоне занято " + placeOccupied + " мест, остались только стоячие места");
    } else if (placeOccupied >= placeInTheCarriage) {
        System.out.println("В вагоне занято " + placeOccupied + " мест, извините, свободных мест нет");
    }
/// Задача 7
    int one = 7;
    int two = 13;
    int three = 15;
    if (one > two && one > three) {
        System.out.println("Наиболбшее число " + one);
    } else if (two > one && two > three) {
        System.out.println("Наибольшее число " + two);
    } else if (three > one && three > two) {
        System.out.println("Наибольшее число " + three);
    }
    /// Задачи выполнены, прошу проверить корректность выполнения. В задачах boolean не использовался, правильно ли это?
    }
}