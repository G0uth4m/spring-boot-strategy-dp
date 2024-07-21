package com.goutham.blog.spring_boot_strategy_dp.before.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Objects;

@Service
public class FileParserService {

    public void parse(File file, String fileType) {
        if (Objects.equals(fileType, "CSV")) {
            /*
            a huge implementation to parse CSV file
            and persist data in db
             */
        } else if (Objects.equals(fileType, "JSON")) {
            /*
            a huge implementation to parse JSON file
            and persist data in db
             */
        } else if (Objects.equals(fileType, "XML")) {
            /*
            a huge implementation to parse XML file
            and persist data in db
             */
        } else {
            throw new IllegalArgumentException("Unsupported file type");
        }
    }

}