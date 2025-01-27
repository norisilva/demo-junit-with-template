# Demo JUnit with Template

This project demonstrates a way to avoid repeating identical values in tests and reduce code duplication. It follows the principle of DRY (Don't Repeat Yourself) to ensure maintainable and clean test code.

## Overview

The project uses `JavaFaker` to generate realistic and varied test data, which helps in creating robust tests that are closer to real-world scenarios. By using templates, we minimize the repetition of code and values across different test cases.

## Key Features

- **DRY Principle**: Avoids repetition of identical values in tests.
- **JavaFaker Integration**: Generates realistic test data.
- **Templates for Test Data**: Reduces code duplication and improves maintainability.

## How to Run the Project

To start the project, run the `App` class located in the `src/main/java/app` directory. This class initializes the `ProdutoValidator` and `ProdutoProcessor` and processes a list of `Produto` instances.
