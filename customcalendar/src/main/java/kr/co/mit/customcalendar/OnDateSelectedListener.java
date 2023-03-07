package kr.co.mit.customcalendar;


import androidx.annotation.NonNull;

public interface OnDateSelectedListener {

    /**
     * Called when a user clicks on a day.
     * There is no logic to prevent multiple calls for the same date and state.
     *
     * @param widget   the view associated with this listener
     * @param date     the date that was selected or unselected
     * @param selected true if the day is now selected, false otherwise
     */
    void onDateSelected(@NonNull CustomCalendar widget, @NonNull CalendarDay date, boolean selected);
}
