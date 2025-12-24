											**JAVA**



java is programming language to communicate with machine to built software
Java is called a high-level language because it is easy for humans to read, write, and understand

human given to binary( high level to low level)converted by compiler and interpreter

assembly level language (byte code) which cant understand by machine and human(middle of HLL \& LLL)

Bytecode is an intermediate (assembly-level) code generated after compilation.

It is not understandable by humans or machines directly.

java is case sensitive.

LLL -> Machine level language (only binary 0s 1s  understandable) ->understanble,readable,instructable by machine
MidLL/AssemblyLL -> ADD,SUB,MUL(pre defined words with binary generation for specific words) -> mnemonics Example: C
Assembler -> like translater conversion of mnemonics as input and translate as os and 1s(MLL to LLL)
HLL -> understanble,readable,instructable by human
compiler => Check line by line if there is any mistake then it gives compile time error if no mistake then generating bytecode


###### **Features of java:**

OOPs (Everything is object)

platform independent (Because of byte code can be run in every OS)

Simple (pre defined function and error detection)

Portable (coz of bytecode can be sent to clients)

Secured(byte code(because of this it is secure) given to devops team to compress and develop a application)

Robust (Strongest Memory Language -> because of GC(Garbage Collector))



first name of java is green talk 2nd name is oak(patent right issues) 3rd coffee bean 4th name is java

Father of java James gosling



High level language(human written) is source file -> .java(System to understand) save the file -> compilation process(javac) to eliminate the errors in source code(compile time errors/syntactical errors/fixed errors) -> generate a byte code(Assembly level language) .class file or executable file (which will be provide to clients) -> execution process done by JRE(Java runtime environment) provide tools and files to JVM(Java virtual machine) -> Low level language(Binary format 0 and 1) -> Decompiler (LLL to HLL)-> output on screen

Components in JVM 
Class Loader -> loads the .class file into JVM -> if class loader fails to to load a class -> ClassNotFoundException or NoClassDefFoundError
Interpreter -> check code line by line (ALL to LLL)
JIT compiler(Just IN Time) -> increase the efficiency of interpreter (to push the interpreter) and improves performance by converting frequently used bytecode into machine code, reducing interpreter workload.


JRE (Java Runtime Environment) provides libraries and tools required to run Java programs and helps JVM during execution.


Compiler is software which convert HLL to ALL(Checks whole code once).


Structure

---

class className

{ ->class body/block/context

public static void main(String\[] args)

&nbsp;	{

&nbsp;	//statements ->method body/method context/block

&nbsp;	}

}

public -> access modifier -> Other modifiers (private, protected) restrict access, so JVM won’t find main.
static - cant be override this method -> JVM does not create object main() \& must run directly \& Saves memory \& Without static, JVM would need an object, but there is no object before execution starts.
void -> no return value and JVM does not expect any value back
className and main method -> Identifiers
String -> Predefined Class It is an array of strings used to receive command-line arguments. we cannot keep int or any other as JVM looks for a fixed method signature and command-line arguments are always passed as strings.
args -> Arguments(store data in string format)
main -> JVM is hard-coded to search for main


Printing Statements -> works from right to left
print() -> data inside braces is mandatory -> no arguments error -> we can give "" (null as a data) ->something data should present
println()-> data inside braces is not mandatory -> print empty line  // just moves to next line



Tokens
---


Smallest individual unit in java Programming language


Keywords - Reserved words with predefined meaning.
identifiers - provide names of java components (classes/Interfaces/variables/methods/Packages)
Literals -> datatypes and variables (Fixed values used in program.)
operators

4 identifier rules

Conventions
It never start with numbers
Never allows space between two characters
No special characters except $ and _
No keywords

Class Conventions for class name

Single word - First Character should UpperCase
Multiple word - First char is upper in every word


Method name:
single word is complete in lowercase
multiple words - palindromeNumber (Second word first char is upper)

Literals ->Literals are fixed values written directly in the program source code.
Integer,Floating point
Character, String ,Boolean ,NULL,Special Escape Sequence Literals
Datatypes - primitive(single data) and non primitive(multiple data)
Number -> Integers and floating and char and boolean -> total 8 types of primitive

		bits 	bytes 		default value

1. byte  	8		1		0	-128 to 127
2. short	16		2		0
3. int		32		4		0	minimum value of -2^31 and a maximum value of 2^31-1.
4. long		64		8		0	minimum value of -2^63 and a maximum value of 2^63-1.
5. float	32		4		0.0
6. double 	64		8		0.0
7. char		16		2		empty space/unique code ->  It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
8. boolean	1		0.125		false

Local - A variable declared inside a method, constructor, or block.
Global - A variable declared inside the class but outside all methods.
final - we cannot re initialize this variable
Default data type is integer where the output will come

Rules 
1 We cannot use local variables without initializing.
2 wherever you declare local variable we should use it there only.
3 cannot have two local variables with same name in same score
