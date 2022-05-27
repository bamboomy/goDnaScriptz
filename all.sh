java -jar parser.jar
javac -cp .:../lib/log4j-1.2.17.jar */*.java */*/*/*/*.java */*/*/*/*/*.java
jar cvfe dummy.jar net.sf.gogui.tools.dummy.Main */*.class */*/*/*/*.class */*/*/*/*/*.class
