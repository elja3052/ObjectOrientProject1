Matthew Menten

Eli Jacobshagen

CSCI 4/5448 - Object Oriented Analysis and Design - Montgomery

Fall 2019

# ObjectOrientProject1
This contains the submission files for Project 1 #4

### Requirements

- Java 8 or higher
    - javac installed
    - java installed

### Compiling and Running the Code

Get the code from Github...

    git clone https://github.com/elja3052/ObjectOrientProject1
    
Navigate into the directory...

    cd ObjectOrientProject1

Compile all .java files into .class files...

    javac *.java

Run the zoo day simulation...

    java Zoo
    
### Brief Description of Class Heirarchy

**Animal**

- Abstract base class
- Contains name and is_sleep members
- Name is passed to the animal constructor from the base class
- Each animal must implement eat, roam and makeNoise methods
- The sleep and wakeup methods have a default implementation

**Animal Category**

- Inherits from Animal class
- Feline, Canine, Pachyderm
- Also an abstract class
- Implements roam method
- Base class must implement eat and makeNoise methods

**Specific Animal**

- Inherits from its respective animal category class
- Cat, Dog, Hippo, etc.
- Implements eat and makeNoise methods
- Name is passed all the way back to the Animal constructor for initialization