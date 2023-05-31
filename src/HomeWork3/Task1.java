package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {

    public static ArrayList<Integer> deleteEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)) % 2 != 0) {
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static Double averageValue(ArrayList<Integer> list) {
        double average = 0;
        double sum = 0;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            average = sum / list.size();
        }
        return average;
    }

    public static int getMax(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static int getMin(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array.add(random.nextInt(101));
        }
        System.out.println("дан произвольный список целых чисел " + array);
        System.out.println("удалены четные числа " + deleteEvenNumbers(array));
        System.out.println("минимальное значение = " + Collections.min(array));
        System.out.println("максимальное значение = " + Collections.max(array));
        System.out.println("среднее значение = " + averageValue(array));
        // Второй способ нахождения минимума и максимума
        System.out.println(getMin(array) + " " + ": " + getMax(array));
    }
}
