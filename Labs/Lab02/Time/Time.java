import java.util.Calendar;
public class Time{
  private int hours;
  private int minutes;
  private int seconds;

  public Time(){
    Calendar cal = Calendar.getInstance();
    hours = cal.get(Calendar.HOUR_OF_DAY);
    minutes = cal.get(Calendar.MINUTE);
    seconds = cal.get(Calendar.SECOND);
  }

  public Time(long elapseTime){
    long totalSeconds = elapseTime / 1000;
    seconds = (int) totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;
    minutes = (int) totalMinutes % 60;

    long totalHours = totalMinutes / 60;
    hours = (int) totalHours % 24;
  }

  public Time(int hours, int minutes, int seconds){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getHours(){
    return hours;
  }

  public int getMinutes(){
    return minutes;
  }

  public int getSeconds(){
    return seconds;
  }

  public void setTime(long elapseTime){
    long totalSeconds = elapseTime / 1000;
    seconds = (int) totalSeconds % 60;

    long totalMinutes = totalSeconds / 60;
    minutes = (int) totalMinutes % 60;

    long totalHours = totalMinutes / 60;
    hours = (int) totalHours % 24;
  }

  public String toString(){
    return "" + hours + " : " + minutes + " : " + seconds;
  }

}
