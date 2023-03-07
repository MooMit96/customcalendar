package kr.co.mit.customcalendar;



public class DecoratorResult {
    public final DayViewDecorator decorator;
    public final DayViewFacade result;
//tt
    DecoratorResult(DayViewDecorator decorator, DayViewFacade result) {
        this.decorator = decorator;
        this.result = result;
    }
}
