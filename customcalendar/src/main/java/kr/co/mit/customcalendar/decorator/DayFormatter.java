package kr.co.mit.customcalendar.decorator;

import android.support.annotation.NonNull;

import kr.co.mit.customcalendar.CalendarDay;
import kr.co.mit.customcalendar.DateFormatDayFormatter;


public interface DayFormatter {

    /**
     * Format a given day into a string
     *
     * @param day the day
     * @return a label for the day
     */
    @NonNull
    String format(@NonNull CalendarDay day);

    /**
     * Default implementation used by {@linkplain com.prolificinteractive.materialcalendarview.MaterialCalendarView}
     */
    public static final DayFormatter DEFAULT = new DateFormatDayFormatter();
}
