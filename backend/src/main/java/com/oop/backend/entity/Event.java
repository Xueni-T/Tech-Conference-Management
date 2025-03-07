package com.oop.backend.entity;
import jakarta.validation.constraints.Positive;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "event")
@AllArgsConstructor
@Builder
public class Event {
    public static int  numberOfVendor=0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private int eventID;
    private String eventName;
    @Positive
    private int ticketCount;
    private String eventDate;
    private String eventTime;
    private String eventLocation;
    private int ticketPrice;
    private String eventImage;
}
