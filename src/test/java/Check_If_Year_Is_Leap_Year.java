import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Check_If_Year_Is_Leap_Year {

        public static Year year;


        @BeforeAll
        public static void init() {
            year = new Year();
        }


        @Test
        void Checks_If_Year_Divisible_By_4_But_Not_100_Is_Leap_Year() {
            int yearToTest = 2024;
            assertTrue(year.isLeapYear(yearToTest),
                    "Year " + yearToTest + " dosent check out as leap year, when it actually is a leap year");
        }


        @Test
        void Checks_If_Year_Divisible_By_400_Is_Leap_Year() {
            int yearToTest = 2000;
            assertTrue(year.isLeapYear(yearToTest),
                    "Year " + yearToTest + " dosent check out as leap year, when it actually is a leap year");
        }


        @Test
        void Checks_If_Year_Not_Divisible_By_4_Is_Not_Leap_Year() {
            int yearToTest = 1781;
            assertFalse(year.isLeapYear(yearToTest),
                    "Year " + yearToTest + " checks out as leap year, when its not a leap year");
        }


        @Test
        void Checks_If_Year_Divisible_By_100_But_Not_400_Is_Leap_Year() {
            int yearToTest = 1800;
            assertFalse(year.isLeapYear(yearToTest),
                    "Year " + yearToTest + " checks out as leap year, when its not a leap year");
        }
    }

