package com.antra.evaluation.reporting_system.pojo.report;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;

@DynamoDBTable(tableName = "pdf-document-store")
public class PDFFile {
    private String id;
    private String fileName;
    private String fileLocation;
    private String submitter;
    private Long fileSize;
    private String description;
    private LocalDateTime generatedTime;

    @DynamoDBHashKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @DynamoDBAttribute
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @DynamoDBAttribute
    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    @DynamoDBAttribute
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    @DynamoDBAttribute
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    public LocalDateTime getGeneratedTime() {
        return generatedTime;
    }

    public void setGeneratedTime(LocalDateTime generatedTime) {
        this.generatedTime = generatedTime;
    }

    @Override
    public String toString() {
        return "PDFFile{" +
                "id='" + id + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileLocation='" + fileLocation + '\'' +
                ", submitter='" + submitter + '\'' +
                ", fileSize=" + fileSize +
                ", description='" + description + '\'' +
                ", generatedTime=" + generatedTime +
                '}';
    }

    static public class LocalDateTimeConverter implements DynamoDBTypeConverter<String, LocalDateTime> {
        @Override
        public String convert( final LocalDateTime time ) {
            return time.toString();
        }

        @Override
        public LocalDateTime unconvert( final String stringValue ) {
            return LocalDateTime.parse(stringValue);
        }
    }
}
