GRAMMAR=Solidity
JAVA_PACKAGE=solidityparser
START_RULE=sourceUnit
GEN_DIR=$(CURDIR)

JAVAC=javac -cp /usr/share/java/antlr-complete.jar
.SUFFIXES:.java .class

.java.class:
	$(JAVAC) $*.java

all: generate

generate: $(GRAMMAR).g4 java-parser python3-parser

java-parser: antlr-java java_classes

antlr-java:
	antlr4 -package $(JAVA_PACKAGE) $(GRAMMAR).g4 -visitor -o $(GEN_DIR)/parser/java/solidityparser

java_classes:
	$(JAVAC) $(wildcard $(GEN_DIR)/parser/java/solidityparser/*.java)

python3-parser: antlr-python3

antlr-python3: 
	antlr4 -Dlanguage=Python3 -visitor $(GRAMMAR).g4 -o $(GEN_DIR)/parser/python3 

.PHONY: all grun-gui antrl-trace generate java-parser python3-parser antlr-java antlr-python3

grun-gui:
	cd $(GEN_DIR)/parser/java; grun $(GRAMMAR) $(START_RULE) -gui

antlr-trace:
	antrl4-parse $(GEN_DIR)/$(GRAMMAR).g4 prog -tokens -trace

clean:
	rm -f $(GEN_DIR)/parser/java/*.class
