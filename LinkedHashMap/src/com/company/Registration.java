package com.company;

public class Registration {

    public static String[] fio = {"Шульгин Владимир Евгеньевич", "Летов Егор Федорович", "Тумбов Олег Анатольевич",
            "Савко Петр Андреевич", "Авренкович Дмитрий Дмитривич", "Алексеев Алексей Алексеевич", "Ив Нур Салам",
            "Елецкая Полина Дмитриевна", "Ломтева Мария Ивановна", "Miller Eva",
            "Надоелова Ксения Артёмовна"};

    public static String[] gender = {"муж", "муж", "муж", "муж", "муж", "муж",
            "жен", "жен", "жен", "жен", "жен"};

    public static int size = fio.length;


    public static void print(Patient pa) {
        System.out.println(" Пациент: " + pa.fullName + ";   Возраст: " + pa.age + ";   Пол: " + pa.gender);
    }


}

