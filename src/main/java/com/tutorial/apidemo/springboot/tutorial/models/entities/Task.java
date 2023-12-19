package com.tutorial.apidemo.springboot.tutorial.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskID;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "important")
    private String important;

    @Column(name = "status")
    private TaskConstant status;

    @Column(name = "assigner_id")
    private Long assigner;

    @Column(name = "supervisor_id")
    private Long supervisor;

    @Column(name = "progress")
    private Long progress;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "project_id")
//    private Project project;

    @Column(name = "project_id")
    private Long projectID;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "task_employee", joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Set<Employee> employees = new HashSet<>();


}
