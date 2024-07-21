package com.goutham.blog.spring_boot_strategy_dp.after.service;

import com.goutham.blog.spring_boot_strategy_dp.after.factory.FileParserFactory;
import com.goutham.blog.spring_boot_strategy_dp.after.parser.FileParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class FileParserService {

    private final FileParserFactory fileParserFactory;

    public void parse(File file, String fileType) {
        FileParser fileParser = fileParserFactory.get(fileType);
        fileParser.parse(file);
    }

}
