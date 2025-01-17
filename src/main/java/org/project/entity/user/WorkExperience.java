package org.project.entity.user;

import jakarta.persistence.*;
import lombok.*;
import org.project.entity.jobPost.Company;
import org.project.entity.jobPost.JobType;
import org.project.entity.jobPost.Position;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "job_type_id")
    private JobType jobType;

    private LocalDate fromDate;
    private LocalDate toDate;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private boolean isDeleted;
}
