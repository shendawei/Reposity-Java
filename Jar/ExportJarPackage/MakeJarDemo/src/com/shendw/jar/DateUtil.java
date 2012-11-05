package com.shendw.jar;

import java.util.Calendar;
import java.util.Date;

public class DateUtil
{
    public static final int      SHIFT_YEAR     = 16;
    public static final int      SHIFT_MONTH    = 8;
    public static final int      SHIFT_DAY      = 0;
    public static final int      SHIFT_ID       = 28;                                          // 28
                                                                                                // ���ܲ�����
    public static final int      BASED_YEAR     = 2012;

    public static final String[] FESTIVALS_NAME = new String[] { Messages.getString("DateUtil.0"), Messages.getString("DateUtil.1"), Messages.getString("DateUtil.2"), Messages.getString("DateUtil.3") }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    public static final int[][]  FESTIVALS_DATA = new int[][] { { setDate(2012, 3, 15, 0), setDate(2012, 5, 12, 3) },
            {}                                 };

    public static boolean isFestival(Date date)
    {
        if (null == date)
        {
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        int index = year - BASED_YEAR;

        if (index >= 0 && index < FESTIVALS_DATA.length)
        {
            int[] values = FESTIVALS_DATA[index];
            for (int value : values)
            {
                if (isSameDate(value, year, month, day))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static String getFestivalName(Date date)
    {
        if (null == date)
        {
            return null;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        int index = year - BASED_YEAR;

        if (index >= 0 && index < FESTIVALS_DATA.length)
        {
            int[] values = FESTIVALS_DATA[index];
            for (int value : values)
            {
                if (isSameDate(value, year, month, day))
                {
                    return FESTIVALS_NAME[getID(value)];
                }
            }
        }

        return null;
    }

    private static boolean isSameDate(int value, int year, int month, int day)
    {
        return (year == getYear(value)) && (month == getMonth(value)) && (day == getDay(value));
    }

    private static int setDate(int year, int month, int day, int id)
    {
        return (id << SHIFT_ID) | (year << SHIFT_YEAR) | (month << SHIFT_MONTH) | (day << SHIFT_DAY);
    }

    private static int getYear(int value)
    {
        return value >> SHIFT_YEAR & 0x0fff;
    }

    private static int getMonth(int value)
    {
        return value >> SHIFT_MONTH & 0x0000ff;
    }

    private static int getDay(int value)
    {
        return value >> SHIFT_DAY & 0x000000ff;
    }

    private static int getID(int value)
    {
        return value >> SHIFT_ID;
    }
}
