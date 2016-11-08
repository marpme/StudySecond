
JC = javac
JCFLAGS = -g
JBINDIR = bin
JAVA = java
JAVAFLAGS = -cp
JDOC = javadoc
JDOCDIR = java-doc
MAINCLASS = Main/Main
SOURCES = ./src/main/Main.java \

default:
	echo 'Run target default'
	mkdir -p $(JBINDIR)
	$(JC) $(JCFLAGS) $(SOURCES) -d $(JBINDIR)

test:
	echo 'Run target test'
	mkdir -p $(JBINDIR)     
	cd $(JBINDIR)	

run:
	echo 'Run target run'
	cd $(JBINDIR) && $(JAVA) $(JAVAFLAGS) . $(MAINCLASS)	

doc:
	echo 'Run target doc' 
	$(JDOC) -version -author -d $(JDOCDIR) $(SOURCES)		

clean:
	echo 'Run target clean'
	$(RM) -r $(JBINDIR)

distclean: clean
	echo 'Run target distclean'
	$(RM) -r $(JDOCDIR)

release: distclean default doc	