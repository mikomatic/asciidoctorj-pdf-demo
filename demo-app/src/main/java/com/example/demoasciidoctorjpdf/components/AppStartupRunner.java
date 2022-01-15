package com.example.demoasciidoctorjpdf.components;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

@Component
public class AppStartupRunner implements ApplicationRunner {

    private final AsciidocPDFRendererAS asciidocPDFRendererAS;

    public AppStartupRunner(AsciidocPDFRendererAS asciidocPDFRendererAS) {
        this.asciidocPDFRendererAS = asciidocPDFRendererAS;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /* This is a static template but could also be generated from dynamic data via any templating
           system (eg. mustache)  */
        String asciidocContent = StreamUtils.copyToString(new ClassPathResource("example-template.adoc").getInputStream(), StandardCharsets.UTF_8);

        asciidocPDFRendererAS.generate(asciidocContent, "uri:classloader:/pdf-theme.yml", Paths.get("./target/output-report.pdf"));
    }
}