public class Year {

    public boolean isLeapYear(int year) {
        boolean result = true;

        if ((year % 4 == 0 && !(year % 100 == 0)) || (year % 400 == 0)) {
            result = true;
        }

        else if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            result = false;
        }

        return result;
    }

}
