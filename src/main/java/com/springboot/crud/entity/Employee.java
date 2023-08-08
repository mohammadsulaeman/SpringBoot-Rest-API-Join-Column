package com.springboot.crud.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    private String firstName;
    private String lastName;
    @Column(length = 15,unique = true)
    private String phone;
    @Column(length = 300,unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "dept_id",referencedColumnName = "deptId")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "org_id",referencedColumnName = "orgId")
    private Organization organization;
}
