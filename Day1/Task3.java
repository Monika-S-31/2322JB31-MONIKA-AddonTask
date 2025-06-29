package Day1;

public class Task3 {

	    public static void main(String[] args) {
	        int year = 2024;
	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }

	    public static boolean isLeapYear(int year) {
	        if (year % 4 == 0) {
	            if (year % 100 != 0 || year % 400 == 0) {
	                return true;
	            }
	        }
	        return false;
	    }
	}


