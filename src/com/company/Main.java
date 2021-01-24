package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int yearOfBirthday = 1994;
	int monthOfBirthday = 4;
	int dayOfBirthday = 7;
	int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;

		System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

	boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
		System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

	char[] myname = new char[7];
	myname[0] = 'Н';
	myname[1] = 'и';
	myname[2] = 'к';
	myname[3] = 'о';
	myname[4] = 'л';
	myname[5] = 'а';
	myname[6] = 'й';

			System.out.print("Массив с моим именем: ");
			System.out.println(myname);

		double myAge = 26.0;
		double partYear = 7.0 / 12.0;
		double suma = myAge + partYear;
		String suma1 = String.format("%.2f",suma);
		System.out.print("Мне " + suma1 + " лет");


	}
}
