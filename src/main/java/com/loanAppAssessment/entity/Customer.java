package com.loanAppAssessment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class Customer {
    String name;
    String email;
    @Id
    String contact; // this is unique for each user
}
