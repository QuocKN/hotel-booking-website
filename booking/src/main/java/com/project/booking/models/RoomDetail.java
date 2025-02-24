package com.project.booking.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "roomdetails")
public class RoomDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Long available;

    private String url;

    @Column(name = "room_type")
    private String roomType;

    private int persons;

    @Column(name = "check_in")
    private Date checkIn;

    @Column(name = "check_out")
    private Date checkOut;

    @Column(name = "room_name")
    private String roomName;

    @Column(name = "price_per_night")
    private Long pricePerNight;

    @Column(name = "description")
    private String description;

    @Column(name = "size")
    private Long size;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @JsonBackReference
    private Hotel hotel;

    @OneToMany(mappedBy = "room", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonManagedReference
    private List<RoomFacilities> facilities;

    @OneToMany(mappedBy = "roomDetail", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonManagedReference
    private List<RoomImage> roomImages;
}
