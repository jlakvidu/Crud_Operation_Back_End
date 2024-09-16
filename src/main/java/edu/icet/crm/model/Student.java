package edu.icet.crm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", allocationSize = 1)
    private Integer studentId;

    private String studentName;
    private Integer studentAge;
    private String studentContactNumber;
    private String guardianName;
    private String guardianAddress;
    private String guardianContactNumber;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String studentImage;
}
