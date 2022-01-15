# asciidoctorj-pdf-demo

This is a quick project to demonstrate usage of `asciidoctorj` and `asciidoctorj-pdf`
to generate simple pdf reports.

The pdf-theme is bundled in `demo-asciidoctorj-pdf` project.

# Build

```
./mvnw clean verify
```

# Generate the example report

```
java -jar .\demo-app\target\demo-app-0.0.1-SNAPSHOT.jar
```

The report will be available in `target\output-report.pdf`.