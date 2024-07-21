package com.goutham.blog.spring_boot_strategy_dp.after.parser.impl;

import com.goutham.blog.spring_boot_strategy_dp.after.constant.FileType;
import com.goutham.blog.spring_boot_strategy_dp.after.parser.FileParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;

@Slf4j
@Service(FileType.CSV)
public class CsvFileParser implements FileParser {

    @Override
    public void parse(File file) {
        log.info("Parsing CSV file");
    }

}
