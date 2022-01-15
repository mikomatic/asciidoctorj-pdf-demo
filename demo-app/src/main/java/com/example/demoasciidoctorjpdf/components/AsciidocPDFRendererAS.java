package com.example.demoasciidoctorjpdf.components;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Attributes;
import org.asciidoctor.Options;
import org.asciidoctor.SafeMode;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Application Service Handling PDF Generation from ASCIIDOC templates
 */
@Service
public class AsciidocPDFRendererAS {

    public void generate(String asciidocContent, String theme, Path outputLocation) {
        try (Asciidoctor asciidoctor = Asciidoctor.Factory.create()) {

            // Optional dependency if report contains diagrams, requires external binary
            asciidoctor.requireLibrary("asciidoctor-diagram");

            Attributes attributes = Attributes.builder()
                    .attribute("pdf-theme", theme)
                    .attribute("doctype", "book")
                    .attribute("icons", "font")
                    .build();

            Options options = Options.builder()
                    .backend("pdf")
                    .attributes(attributes)
                    .toFile(outputLocation.toFile()).build();

            asciidoctor.convert(asciidocContent, options);
        }
    }
}
