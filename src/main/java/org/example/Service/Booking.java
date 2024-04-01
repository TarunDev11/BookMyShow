package org.example.Service;

import org.example.Enum.BookingStatus;
import org.example.Model.Payment;
import org.example.Model.Show;
import org.example.Model.Showseats;
import org.example.Model.User;

import java.util.Date;
import java.util.List;

public class Booking {
    private User user;
    private double amount;
    private Date BookedAt;
    private List<Payment> payments;
    private List<Showseats> showseats;
    private BookingStatus bookingStatus;
    private Show show;
}
