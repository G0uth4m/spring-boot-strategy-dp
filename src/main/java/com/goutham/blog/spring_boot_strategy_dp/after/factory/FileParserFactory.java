package com.goutham.blog.spring_boot_strategy_dp.after.factory;

import com.goutham.blog.spring_boot_strategy_dp.after.parser.FileParser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class FileParserFactory {

    /**
     * Spring boot's dependency injection feature will construct this map for us
     * and include all implementations available in the map with the key as the bean name
     * Logically, the map will look something like below
     * {
     * "CSV": CsvFileParser,
     * "XML": XmlFileParser,
     * "JSON": JsonFileParser
     * }
     */
    private final Map<String, FileParser> fileParsers;

    /**
     * Return's the appropriate FileParser impl given a file type
     *
     * @param fileType one of the file types mentioned in class FileType
     * @return FileParser
     */
    public FileParser get(String fileType) {
        FileParser fileParser = fileParsers.get(fileType);
        if (Objects.isNull(fileParser)) {
            throw new IllegalArgumentException("Unsupported file type");
        }
        return fileParser;
    }

}