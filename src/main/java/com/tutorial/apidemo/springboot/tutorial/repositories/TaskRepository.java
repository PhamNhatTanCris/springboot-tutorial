package com.tutorial.apidemo.springboot.tutorial.repositories;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Long> {

//    Page<Task> findAll(Pageable pageable);

    @Override
    Page<Task> findAll(Pageable pageable);

    Page<Task> findAll(Pageable pageable, Sort sort);
    @Query(value = """
                select employee_name
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                where t.task_id = :id
            """, nativeQuery = true)
    List<?> findEmployeeByIdTask(@Param("id") Long id);

    @Query(value = """
                select status, count(status)
                from tasks
                group by status
            """, nativeQuery = true)
    List<?> countStatus();

    @Query(value = """
                select *
                from tasks
                where task_id > 2
            """, nativeQuery = true)
    List<Task> findTask();

    @Query(value = """
                select employee_name, status, count(employee_name), count(status)
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                group by 1, 2
            """, nativeQuery = true)
    List<?> findEmpSta();

    @Query(value = """
               select *
               from tasks
               where task_name like "%:name%"
            """, nativeQuery = true)
    List<?> findAnything(@Param("name") String name);

    @Query(value = """
                select employee_name, status, count(status)
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                group by 1, 2
                having employee_id in :employee_id
            """, nativeQuery = true)
    List<?> chartEmployeeStatus(@Param("employee_id") List<?> employeeName);

    @Query(value = """
                select employee_id, employee_name  
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                where progress > :number
            """, nativeQuery = true)
    List<?> chartCountEmployeeStatus(@Param("number") Integer number);

    @Query(value = """
                select supervisor_id
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
            """, nativeQuery = true)
    List<?> findTaskBySupervisor();

    @Query(value = """
                select assigner_id, assigner_name
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                group by 1, 2
                having assigner_name like "%:assigner_name%"
            """, nativeQuery = true)
    List<?> findTaskByAssigner(@Param("assigner_name") String name);

    @Query(value = """
                select employee_name, count(employee_name)
                from tasks t
                inner join task_employee te on t.task_id = te.task_id
                inner join employee e on te.employee_id = e.employee_id
                group by 1
                having employee_name in (':name')
            """, nativeQuery = true)
    List<?> showCountPersonalWork(@Param("name") List<String> name);

    @Query(value = """
                select m 
                from tasks m
                where task_name like "%front end"
            """, nativeQuery = true)
    List<?> showWhatToDo();



}
