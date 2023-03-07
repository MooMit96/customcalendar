package kr.co.mit.customcalendar;

import androidx.annotation.NonNull;



import java.util.List;

public interface OnRangeSelectedListener {

    /**
     * Called when a user selects a range of days.
     * There is no logic to prevent multiple calls for the same date and state.
     *
     * @param widget   the view associated with this listener
     * @param dates     the dates in the range, in ascending order
     */
    void onRangeSelected(@NonNull CustomCalendar widget, @NonNull List<CalendarDay> dates);
}
