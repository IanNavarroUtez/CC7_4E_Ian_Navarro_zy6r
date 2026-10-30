package com.example.zy6r_4E_Ian_Navarro_CC7.repository;


import com.example.zy6r_4E_Ian_Navarro_CC7.model.PrestamoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoRepository extends JpaRepository<PrestamoModel, Long> {
}
