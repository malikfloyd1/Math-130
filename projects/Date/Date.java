/**
 * Description here.
 * @author Malik Floyd
 */
public class Date {
  
  // Add JavaDoc
  public static boolean isValid(int year, int month, int day) {
    boolean isValid = false;
    if(1 <= month && month <= 12){
      switch (month){
        case 1, 3, 5, 7, 8, 10, 12:
          if(1 <= day && day <= 31){
          isValid = true;
        }
          break;
        case 4, 6, 9, 11:
          if( 1 <= day && day <= 30){
          isValid = true;
        }
          break;
        case 2:
          if(isLeapYear(year)){
            if ( 1 <= day && day <= 29){
              isValid = true;
            }
              break;
            else{
              if ( 1 <= day && day <= 28){
                inValid = true;
              }
            break;
          }
    }
    return isValid;
  }
  
  // Add JavaDoc
  public static String toString(int year, int month, int day) {
    String date = "";
    if(isValid(year, month, day));{
      return String.format("%04d-%02d-%02d);
    }
    return date;
  }
  
  // Add JavaDoc
  public static String monthString(int month) {
    String monthString = "invalid month";
    // Complete code
    return monthString;
  }
  
  /**
   * Determines if the given year is a leap year
   * @param year the given year
   * @return {@code true} if {@code year} is a leap year
   */
  public static boolean isLeapYear(int year) {
    boolean leap = false;
    // if the year is divided by 4
    if (year % 4 == 0) {
      // if the year is century
      if (year % 100 == 0) {
        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      // if the year is not century
      else
        leap = true;
    }
    else
      leap = false;
    return leap;
  }
  
}
