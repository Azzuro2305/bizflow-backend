package org.project.entity.User;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.University.FieldOfStudy;
import org.project.enums.QualificationType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "qualification_type_id")
    private QualificationType qualificationType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "field_of_study_id")
    private FieldOfStudy fieldOfStudy;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    private String qualification;
    private LocalDate fromDate;
    private LocalDate toDate;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
