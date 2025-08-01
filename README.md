# Stack and Queue Implementations

This repository contains custom implementations of **Stack** and **Queue** data structures using arrays in Java.

## Overview

### Stack
A Stack is a Last-In-First-Out (LIFO) data structure.  
The last element inserted is the first one to be removed.

### Queue
A Queue is a First-In-First-Out (FIFO) data structure.  
The first element inserted is the first one to be removed.

## Implementation Details

### Stack
- Internally uses a fixed-size array.
- Operates with a single pointer (`top`) to track the stack’s current position.
- Includes a **dynamic stack** implementation:
  - When the stack is full, it creates a new array of double the size.
  - All existing elements are copied to the new array.
  - The old array is replaced, and garbage collection handles cleanup.

### Queue
- Also implemented using a fixed-size array.
- In the basic version, a single pointer is used.
  - On `dequeue`, remaining elements are shifted to the left.
- Includes a **dynamic queue**:
  - Automatically resizes to accommodate more elements using the same approach as the dynamic stack.

### Circular Queue
- Uses two pointers: `front` and `rear`.
- Modular arithmetic (`%`) is used to wrap around when the end of the array is reached.
- Enables efficient space reuse without shifting elements.
- Different from the basic queue in how it manages insert and remove operations.

## Notes
- These implementations are designed for learning and practicing core DSA concepts.
- All code is written from scratch and kept simple for better understanding.
- No external libraries or frameworks are used.
