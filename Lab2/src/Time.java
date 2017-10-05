import java.util.Calendar;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time()
	{
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	
	public Time(int h, int m, int s)
	{
		hour = h;
		minute = m;
		second = s;
	}
	public Time(long elapseTime)
	{
		double totalSeconds = elapseTime / 1000;
		double time_seconds = totalSeconds % 60;
		double totalMinutes = totalSeconds / 60;
		double time_minutes = totalMinutes % 60;
		double totalHours = totalMinutes / 60;
		double time_hour = totalHours % 24;
		hour = (int)time_hour;
		minute = (int)time_minutes;
		second = (int)time_seconds;
	}
	public void setTime(long elapseTime)
	{
		double totalSeconds = elapseTime / 1000;
		double time_seconds = totalSeconds % 60;
		double totalMinutes = totalSeconds / 60;
		double time_minutes = totalMinutes % 60;
		double totalHours = totalMinutes / 60;
		double time_hour = totalHours % 24;
		hour = (int)time_hour;
		minute = (int)time_minutes;
		second = (int)time_seconds;
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	public void print()
	{
		System.out.println("Hour: " + getHour());
		System.out.println("Minute: " + getMinute());
		System.out.println("Second: " + getSecond());
	}

}
