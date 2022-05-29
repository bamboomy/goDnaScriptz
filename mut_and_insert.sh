
echo $1 $2

java -jar ../../../jars/mutator.jar $1 $2

first=$(md5sum $1)
second=$(md5sum $2)

IN="$first"
arrIN=(${IN// / })
firstMd5=${arrIN[0]}

IN="$second"
arrIN=(${IN// / })
secondMd5=${arrIN[0]}

mysql --user=genetic --password=Str1ktG3h31^^ genetic << EOF
INSERT INTO genetic (\`hash\`, \`path\`, \`mutatee\`) VALUES ("$thirdMd5", "1/children/$3", "$secondMd5");
EOF