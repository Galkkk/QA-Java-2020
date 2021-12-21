package com.company;

import java.util.*;
import java.util.Comparator;

public class Main {

    private static int i = 0;
    private static int k = 1;
    public static final int maxPatients = 20;

    public static void main(String[] args) {
        int f = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Рады видеть Вас в нашей электронной поликлинике!");

        Map<Integer, Patient> allPatients = new LinkedHashMap<>();


        while (3 != i) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Выберите пункт меню(1,2,3)");
            System.out.println("1-Регистрация");
            System.out.println("2-Запись на прием");
            System.out.println("3-Выход из программы");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int num = scan.nextInt();
            i = num;


            switch (i) {
                case 1:

                    for (int n = 0; n <= (Registration.size - 1); n++) {
                        int generator = (int) (40 + Math.random() * 60);
                        int key = n + 101;
                        Patient p = new Patient(key, Registration.fio[n], generator, Registration.gender[n]);
                        allPatients.put(key, p);
                    }

                    for (Map.Entry<Integer, Patient> entry : allPatients.entrySet()) {
                        System.out.print("Пациент №" + k);
                        k++;
                        System.out.print("  ID: " + entry.getKey() + " ");
                        Registration.print(entry.getValue());
                    }

                    System.out.println();
                    break;


                case 2:
                    System.out.println("Очередь к врачу");

                    Queue<Patient> firstQueue = new ArrayDeque<>();
                    Queue<Patient> secondQueue = new ArrayDeque<>();

                    for (Patient p11 : allPatients.values()) {

                        if ((p11.gender.equals("муж")) && (p11.age >= 65)) {
                            firstQueue.add(p11);
                        } else {
                            if ((p11.gender.equals("жен")) && (p11.age >= 60)) {
                                firstQueue.add(p11);
                            } else {
                                secondQueue.add(p11);
                            }
                        }
                    }

                    for (Patient p2 : secondQueue) {
                        firstQueue.add(p2);
                    }

                    for (Patient p3 : firstQueue) {
                        f++;
                        System.out.print("№" + f);
                        System.out.println("  ID: " + p3.id + " Пациент: " + p3.fullName +
                                ";   Возраст: " + p3.age + ";   Пол: " + p3.gender);
                    }

                    System.out.println();
                    break;


                case 3:
                    System.out.println("Спасибо, что воспользовались нашей электронной поликлиникой :)");
                    System.out.println("До свидания!");
                    System.exit(0);

                default:
                    System.out.println("Пункт меню " + i + " не существует. Выберите другой пункт.");
            }
        }
    }
}


