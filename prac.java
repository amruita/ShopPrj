package javapractice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class prac {

	public static void main(String[] args) {

		long timeSeed = System.nanoTime(); // to get the current date time value

		double randSeed = Math.random() * 1000; // random number generation

		long midSeed = (long) (timeSeed * randSeed); // mixing up the time and
														// rand number.



		String s = midSeed + "";
		String subStr = s.substring(0, 9);

		int finalSeed = Integer.parseInt(subStr); // integer value

		System.out.println(finalSeed);
		System.out.println(finalSeed);

	}
}
