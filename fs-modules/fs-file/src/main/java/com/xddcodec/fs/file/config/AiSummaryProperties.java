package com.xddcodec.fs.file.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "fs.ai.summary")
public class AiSummaryProperties {

    /**
     * Enable remote LLM summary. Local rule-based summary is used when disabled.
     */
    private Boolean enabled = false;

    /**
     * OpenAI-compatible chat completions endpoint.
     */
    private String endpoint = "https://api.openai.com/v1/chat/completions";

    private String apiKey;

    private String model = "gpt-4o-mini";

    private Integer timeoutMs = 30000;

    /**
     * Max source text characters sent to the summary engine.
     */
    private Integer maxChars = 12000;
}
