
cp ~/genetic/gens/0/dna$1 /home/sander/genetic/parser/parser$2/goDnaGtpNoGit/test

cd /home/sander/genetic/parser/parser$2/goDnaGtpNoGit/

rm -Rf genetic
java -jar parser.jar
./insert.sh
cd src
javac -cp .:../lib/log4j-1.2.17.jar */*.java */*/*/*/*.java */*/*/*/*/*.java
jar cvfe dummy.jar net.sf.gogui.tools.dummy.Main */*.class */*/*/*/*.class */*/*/*/*/*.class

cp dummy.jar ~/genetic/pit/pit$1/
