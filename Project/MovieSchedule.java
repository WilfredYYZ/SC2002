import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.lang.model.util.ElementScanner14;

import java.time.format.DateTimeFormatter;
public class MovieSchedule {
	private String Movie;
	private int Room;
	private String ShowTime;
	public MovieSchedule(String Movie, int Room, String ShowTime) {
		this.Movie = Movie;
		this.Room = Room;
		this.ShowTime = ShowTime;
	}
	public void fku(){
		System.out.println("Enter name of Movie: ");
		Scanner scanner = new Scanner(System.in);
		String Movie = scanner.nextLine();

		System.out.println("Enter Room: ");
		Scanner scanner1 = new Scanner(System.in);
		int Room = scanner1.nextInt();

		System.out.println("Enter ShowTime in ddmmyy hhmm format: ");
		Scanner scanner2 = new Scanner(System.in);
		String ShowTime = scanner2.nextLine();
	}
}
