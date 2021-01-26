package com.antra.evaluation.reporting_system.repo;

import com.antra.evaluation.reporting_system.entity.ExcelFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class ExcelRepositoryImpl implements ExcelRepository {

    @Autowired
    private ExcelJpaRepository excelJpaRepository;

    @Override
    public Optional<ExcelFile> getFileById(String id) {
        return excelJpaRepository.findById(id);
    }

    @Override
    public ExcelFile saveFile(ExcelFile file) {
        return excelJpaRepository.save(file);
    }

    @Override
    public ExcelFile deleteFile(String id) {
        ExcelFile file = excelJpaRepository.findById(id).orElseThrow(
            () -> new IllegalArgumentException("Id to delete not found"));
        excelJpaRepository.deleteById(id);
        return file;
    }

    @Override
    public List<ExcelFile> getFiles() {
        return excelJpaRepository.findAll();
    }
}

