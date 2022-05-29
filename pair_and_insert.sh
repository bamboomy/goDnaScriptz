
echo $1 $2 $3 $4

java -jar ../../../jars/pairer.jar $1 $2 $3 $4

first=$(md5sum $1)
second=$(md5sum $2)
third=$(md5sum $3)
fourth=$(md5sum $4)

echo $first $second $third $fourth

IN="$first"
arrIN=(${IN// / })
firstMd5=${arrIN[0]}

IN="$second"
arrIN=(${IN// / })
secondMd5=${arrIN[0]}

IN="$third"
arrIN=(${IN// / })
thirdMd5=${arrIN[0]}

IN="$fourth"
arrIN=(${IN// / })
fourthMd5=${arrIN[0]}

mysql --user=genetic --password=Str1ktG3h31^^ genetic << EOF
INSERT INTO genetic (\`hash\`, \`path\`, \`parent1\`, \`parent2\`) VALUES ("$thirdMd5", "1/children/$3", "$firstMd5", "$secondMd5");
INSERT INTO genetic (\`hash\`, \`path\`, \`parent1\`, \`parent2\`) VALUES ("$fourthMd5", "1/children/$4", "$firstMd5", "$secondMd5");
EOF