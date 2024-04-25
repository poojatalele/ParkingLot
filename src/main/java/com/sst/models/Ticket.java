package com.sst.models;

import java.util.Date;

public class Ticket {
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot assignedSpot;
    private Gate generatedAt;
    private Operator generatedBy;
}
