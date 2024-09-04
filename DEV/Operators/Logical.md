# Java Logical Operators

Logical operators in Java are used to combine multiple boolean expressions or values. They play a crucial role in controlling the flow of execution in conditional statements.

## Types of Logical Operators

Java provides three primary logical operators:

1. **Logical AND (`&&`)**
2. **Logical OR (`||`)**
3. **Logical NOT (`!`)**

### Logical AND (`&&`)

- **Function:** Returns `true` if both operands are `true`. If either operand is `false`, it returns `false`.
- **Short-Circuit Evaluation:** If the first operand evaluates to `false`, the second operand is not evaluated because the result is guaranteed to be `false`.

### Logical OR (`||`)

- **Function:** Returns `true` if at least one of the operands is `true`. It returns `false` only if both operands are `false`.
- **Short-Circuit Evaluation:** If the first operand evaluates to `true`, the second operand is not evaluated because the result is guaranteed to be `true`.

### Logical NOT (`!`)

- **Function:** Inverts the boolean value of its operand. If the operand is `true`, it returns `false`, and if it is `false`, it returns `true`.

## Comparison with Bitwise Operators

- **Bitwise AND (`&`):** Performs a bit-level AND operation and does not use short-circuit evaluation.
- **Bitwise OR (`|`):** Performs a bit-level OR operation and does not use short-circuit evaluation.
- **Bitwise XOR (`^`):** Performs a bit-level XOR operation and does not use short-circuit evaluation.

- **Logical AND (`&&`):** Evaluates to `true` if both operands are `true`.
- **Logical OR (`||`):** Evaluates to `true` if at least one operand is `true`.
- **Logical NOT (`!`):** Inverts the boolean value of the operand.

These operators are fundamental for constructing complex conditional statements and controlling the flow of your Java programs.
