# Algorithmic Benchmark Suite (Java)

> R language version of this repository: [Algorithmic Benchmark Suite (R)](https://github.com/celsomsilva/algorithmic-benchmark-suite-R)
> Rust language version of this repository: [Algorithmic Benchmark Suite (Rust)](https://github.com/celsomsilva/algorithmic-benchmark-suite-rust)

A **benchmarking and reproducibility framework** for classical algorithms,
focused on explicit reasoning, correctness, and performance evaluation in Java.

This repository contains modern Java implementations of classical algorithms,
designed to be **testable, benchmarkable, and reproducible**.

The implementations are conceptually inspired by legacy Pascal and C code
written in the early 2000s, which is preserved separately as a historical
reference.

The idea is simple:

- study classical algorithms through explicit implementations,
- reimplement them in Java without hiding logic behind helpers,
- validate correctness with automated tests,
- measure performance with reproducible benchmarks.

This project is both:

- a **technical portfolio**, demonstrating algorithmic engineering,
  test automation, and benchmarking in Java,
- and a **modern engineering layer**, built on top of historical algorithmic training.

---

## Motivation

This project was inspired by a job description I encountered on LinkedIn that
emphasized **code reasoning, algorithmic benchmarking, correctness, and
performance evaluation(R language)**.

Rather than treating those requirements as an abstract checklist, I decided
to turn them into a **concrete engineering project**: a structured framework
for designing, testing, documenting, and benchmarking classical algorithms in Java.

While the original motivation came from an industry role, the scope and
implementation of this repository are entirely **author-driven**, focusing on
clarity, explicit reasoning, and reproducibility rather than interview-style
solutions.

---

## What’s Inside

- A small, curated subset of **Pascal/C source files** (`selected_algorithms/`)
  used as direct conceptual references
- Explicit **Java implementations** of classical algorithms
- Automated correctness tests (**JUnit**)
- Performance benchmarks using simple, explicit timing harnesses
- Small technical documents explaining reasoning and performance behavior

---

## Legacy Code Reference

This repository includes a minimal `selected_algorithms/` directory
containing only the legacy Pascal and C files that are directly referenced
by the Java implementations.

The complete, unmodified and cleaned legacy archive is preserved separately at:

https://github.com/celsomsilva/algorithmic-legacy-code

All files in `selected_algorithms/` are included strictly for contextual
reference. No algorithmic logic was altered.

---

## Repository Layout

```
algorithmic-benchmark-suite-java/
  selected_algorithms/        # minimal legacy reference (Pascal/C)
  
  modern_java/
    src/
      main/java/
        org/algorithmic/benchmark/
          search/
          sort/
          structures/
      test/java/
        org/algorithmic/benchmark/
    benchmarks/               # simple benchmarks
       
  docs/                        # Markdown technical notes
  README.md
  .gitignore
  LICENSE
  build.gradle
  settings.gradle

```
---

## Getting Started


### Requirements

- Java 17
- Gradle

No additional frameworks are required.


### Building the Project


The project uses Gradle for compilation and test execution.

To compile the source code and run all automated tests:

```bash
./gradlew build
```


### Running Tests

If you only want to run the tests:

```bash
./gradlew test
```


### Running Benchmarks

Benchmarks are plain Java programs and are not wired to a single
`run` task.

Each benchmark can be executed explicitly by running its
`main` method, either from the command line (via javac and java commands) or directly from an IDE.
Command-line example:

Compile all:

``` bash
javac -cp build/classes/java/main modern_java/benchmarks/*.java
```

Run a benchmark (Java source-file mode, java >= 11)


``` bash
java -cp build/classes/java/main modern_java/benchmarks/BinarySearchBenchmark.java
```

---

## Author

This project was developed by an engineer and data scientist with a background in:

* Postgraduate degree in **Data Science and Analytics (USP)**
* Bachelor's degree in **Computer Engineering (UERJ)**
* Special interest in statistical models, interpretability, and applied AI
* Strong interest in algorithmic reasoning, correctness, and performance evaluation

---

## Contact

* [LinkedIn](https://linkedin.com/in/celso-m-silva)
* Or open an [issue](https://github.com/celsomsilva/algorithmic-benchmark-suite-java/issues)


