# asciidoctorj-pdf-demo

This is a quick project to demonstrate usage of `asciidoctorj` and `asciidoctorj-pdf`
to generate simple pdf reports.

The pdf-theme is bundled in `demo-asciidoctorj-pdf` project.

# Requirements

- Java 17
- _(optional)_ for diagrams to work, a Graphviz/dot executable should be available in the path (
  check [asciidoctor-diagram documentation](https://docs.asciidoctor.org/diagram-extension/latest/#specifying-diagram-generator-paths))

# Build

```
./mvnw clean verify
```

# Generate the example report

```
java -jar .\demo-app\target\demo-app-0.0.1-SNAPSHOT.jar
```

The report will be available in `target\output-report.pdf`. An example report is
available [here](https://github.com/mikomatic/asciidoctorj-pdf-demo/blob/main/output-report.pdf).
