package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Booking;
import com.klef.fsad.exam.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking addBooking(Booking booking) {
        if (booking.getBookingId() == null) {
            throw new IllegalArgumentException("bookingId must be provided and is not auto-generated");
        }
        return bookingRepository.save(booking);
    }

    public String deleteBooking(int id) {
        if (bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
            return "Booking with id" + id + "deleted successfully";
        } else {
            return "Booking with id" + id + " not found";
        }
    }
}
