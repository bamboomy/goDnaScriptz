
cp $1 /home/sander/genetic/parser/parser$2/goDnaGtpNoGit/test

first=$(md5sum $1)
rm ../pit/pit$3/hash/*

cd /home/sander/genetic/parser/parser$2/goDnaGtpNoGit/

rm -Rf genetic
java -jar ../../../jars/parser.jar
./insert.sh
cd src

if ! javac -cp .:../lib/log4j-1.2.17.jar */*.java */*/*/*/*.java */*/*/*/*/*.java
then

	exit 1
fi
       
jar cvfe dummy.jar net.sf.gogui.tools.dummy.Main */*.class */*/*/*/*.class */*/*/*/*/*.class

cp dummy.jar ~/genetic/pit/pit$3/

IN="$first"
arrIN=(${IN// / })
firstMd5=${arrIN[0]}

touch ~/genetic/pit/pit$3/hash/$firstMd5

