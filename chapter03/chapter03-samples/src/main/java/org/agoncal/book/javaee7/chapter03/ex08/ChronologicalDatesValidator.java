package org.agoncal.book.javaee7.chapter03.ex08;

import org.agoncal.book.javaee7.chapter03.ex06.Order06;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Antonio Goncalves
 * APress Book - Beginning Java EE 7 with Glassfish 4
 * http://www.apress.com/
 * http://www.antoniogoncalves.org
 * --
 */
public class ChronologicalDatesValidator implements ConstraintValidator<ChronologicalDates, Order08> {

    @Override
    public void initialize(ChronologicalDates constraintAnnotation) {
    }

    @Override
    public boolean isValid(Order08 order, ConstraintValidatorContext context) {
        try {
            return order.getCreationDate().getTime() < order.getPaymentDate().getTime() &&
                    order.getPaymentDate().getTime() < order.getDeliveryDate().getTime();
        } catch (NullPointerException e) {
            return false;
        }
    }
}