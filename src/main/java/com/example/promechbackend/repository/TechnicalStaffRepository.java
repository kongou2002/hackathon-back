package com.example.promechbackend.repository;

import com.example.promechbackend.entity.TechnicalStaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalStaffRepository extends JpaRepository<TechnicalStaffEntity, Integer> {

    @Query(value = "SELECT * FROM TechnicalStaff WHERE Phone = :phone AND Password = :password", nativeQuery = true)
    TechnicalStaffEntity login(String phone, String password);
}
