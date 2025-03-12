/**
 * @MalikFloyd
 */
public class Date {

  //If day, month, or year is out of range it will return false.
  public static boolean isValid(int year, int month, int day) {
    boolean isValid = false;
    if(month < 1 && month < 12){
  }
    if(day < 1 && day > 31){
      return isValid;
    }
    switch(month){
        case: 1, 3, 7, 8, 10, 12;
        return day <= 31;
        case: 4, 6, 9, 11;
        return <= 30;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
          return day <= 29;
        }
        else {
          return day <= 28;
        }
  
  // Formatting given date.
  public static String toString(int year, int month, int day) {
    String date = "YYYY-MM-DD";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date);
    return date;
  }
  
  // Determining if month is in range and return int into month name.
 public static String monthString(int month) {
    String monthString = "invalid month";

    switch(month) {
        case 1:
            monthString = "January";
            break;
        case 2:
            monthString = "February";
            break;
        case 3:
            monthString = "March";
            break;
        case 4:
            monthString = "April";
            break;
        case 5:
            monthString = "May";
            break;
        case 6:
            monthString = "June";
            break;
        case 7:
            monthString = "July";
            break;
        case 8:
            monthString = "August";
            break;
        case 9:
            monthString = "September";
            break;
        case 10:
            monthString = "October";
            break;
        case 11:
            monthString = "November";
            break;
        case 12:
            monthString = "December";
            break;
        default:
            break;
    }

    return monthString;
}

  }
  
  public static boolean isLeapYear(int year) {
    boolean leap = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      else
        leap = true;
    }
    else
      leap = false;
    return leap;
  }
  
}
