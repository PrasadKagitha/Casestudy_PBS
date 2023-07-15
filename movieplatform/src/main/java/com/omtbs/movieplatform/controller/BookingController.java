package com.omtbs.movieplatform.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Can be created as a separate microservice in real time project.
 *
 */
@RestController
@RequestMapping("/bookings")
public class BookingController {

    @RequestMapping(method = RequestMethod.POST, value = "reserveseat")
    public Map<String, String> bookSeat(@RequestBody Map<String, Object> requestPayload) {

        return new HashMap<>();
    }

}
