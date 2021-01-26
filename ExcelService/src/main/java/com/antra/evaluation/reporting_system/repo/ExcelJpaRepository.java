package com.antra.evaluation.reporting_system.repo;

import com.antra.evaluation.reporting_system.entity.ExcelFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcelJpaRepository extends JpaRepository<ExcelFile, String> {

}


