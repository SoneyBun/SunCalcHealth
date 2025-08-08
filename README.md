# 🚨 REPOSITORY IS OUTDATED AND REPLACED WITH [SUNCALC V3](https://github.com/SoneyBun/SunCalc-V3)

# BMI & Height Estimation Calculator

## Overview
This Java program calculates the **Body Mass Index (BMI)** and estimates height based on parental height. The program allows users to choose between the **Metric** and **Imperial** measurement systems.

## Features
- **BMI Calculation**: Determines BMI based on user-provided height and weight.
- **Height Estimation**: Predicts a user's height based on the heights of their parents.
- **Unit Conversion Support**: Opens a web page for unit conversions if needed.

## How It Works
1. The program starts by displaying a **disclaimer** that it is not intended for medical use.
2. The user selects a **measurement system**:
   - Metric (meters, kilograms)
   - Imperial (inches, pounds)
3. The program automatically opens [UnitConverters.net](https://www.unitconverters.net/) in the default web browser.
4. The user chooses an option:
   - **(1) Calculate BMI**
   - **(2) Estimate Height**
   - **(0) Exit the program**
5. Based on the choice, the program:
   - Calculates and categorizes **BMI** into underweight, normal, overweight, or obese.
   - Estimates height using parental heights and gender-based formulas.

## BMI Categories
| BMI Range  | Weight Class |
|------------|-------------|
| < 18.5    | Underweight  |
| 18.5 - 24.9 | Normal     |
| 25 - 29.9  | Overweight  |
| ≥ 30      | Obese      |

## Height Estimation Formula
The program estimates height based on gender:
- **Male**: `((Mother's Height + Father's Height + Offset) / 2)`
- **Female**: `((Mother's Height + Father's Height - Offset) / 2)`
- Offset: **13 cm (Metric) / 5 in (Imperial)**

## Requirements
- Java Development Kit (JDK) installed
- A system that supports **Java AWT Desktop** (for opening the browser)

## Running the Program
1. Compile the program:
   ```sh
   javac Main.java
   ```
2. Run the program:
   ```sh
   java Main
   ```
3. Follow the on-screen prompts to enter your data and get results.

## Notes
- The program **does not** store or process data beyond user input.
- If the system does not support **Desktop browsing**, the web page will not open.
- The program runs in a **loop** until the user selects option `0` to exit.

## Disclaimer
This program is for **informational purposes only** and should not be used for medical decisions.

