# **Types Of Languages:**



1. ***Procedural Language:***
   -> Specifies the a well-structured steps and procedures to compose a program.
   -> Contains a systematic order of statements, functions and commands to complete task.
2. ***Functional Language:***
   -> Writing a program in a pure functions i.e. never modify variables, but only create new ones as an output.
   -> Used in situations where we have to perform lots of different operations on the same set of data, like ML.
3. ***Object Oriented Language:***
   -> Revolves around objects.
   -> Code + Data = Object.

 	-> Developed to make it easier to develop, debug, reuse, and maintain software.





# **Static v/s Dynamic Languages:**



* ***Static Language:***

  -> Perform type checking at compile time.

   	-> Errors will show at compile time.

   	-> Declare datatype before you use it.

   	-> More control.

  

* ***Dynamic Language:***

  -> Perform type checking at runtime.

   	-> Error might not show till program is run.

   	-> No need to declare datatype of variables.

   	-> Saves time in writing code but might give error at runtime.

  

  

  # **How Java Code Executes:**

  

   		\*compiler\*		              \*interpreter\*

  

    .java file		 **----->**		.class file		**----->**		 Machine code

  (Human Readable)     *(Entire File)*	(Byte Code)	    *(Line By Line)*	  (0s and 1s)

  

  

  # **Java - Platform Independent Language:**

  

  -> It means that byte code can run on all operating systems.

  -> We need to convert source code to machine code so computer can understand.

  -> Compiler helps to doing this by turning it into executable code.

  -> This executable code is a set of instructions for the computer.

  -> After compiling C/C++ code we get .exe file which is platform dependent.

  -> In java, We get bytecode, JVM converts this to machine code.

  -> Java is platform-independent but JVM is platform dependent.

  

  

  ## **JDK *-*** *Java Development Kit:*

  

  -> Provides environment to develop and run the java Program.

  -> It is a package that includes:

1. Development Tools: To provide an environment to develop your program.
2. JRE: To execute your program.
3. A compiler: "javac"
4. Archiver: "jar"
5. Doc Generator: "javadoc"
6. Interpreter/Loader

   

   

   ## **JRE -** *Java Runtime Environment*

   

   -> It is an installation package that provides environment to only run the program.

   -> It consists of:

7. Deployment technologies
8. User interface toolkits
9. Integration libraries
10. Base libraries
11. JVM - Java Virtual Machine

    -> After we get the .class file, the next things happen at runtime:

12. Class loader loads all classes needed to execute the program.
13. JVM sends code to byte code verifier to check the format of code.

    

    

    

    # **What Happens at...**

    

* ### *Compile Time:*
