package com.kaiburr.javaAPI;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class serverData {
    @Id
    private String id;
    private String name;
    private String language;
    private String framework;

    public serverData(String id, String name, String language, String framework) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }
}
