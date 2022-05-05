MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

MarkdownParseTestMatthew.class: MarkdownParseTestMatthew.java 	
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTestMatthew.java

Test: MarkdownParseTestMatthew.class MarkdownParse.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTestMatthew