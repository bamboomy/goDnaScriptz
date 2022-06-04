
counter=0

for i in ../gens/1/mutaterz/*
do
	java -jar ../jars/mutator.jar $i ../gens/1/mutated/mutated_$counter
	
	first=$(md5sum $i)
	
	IN="$first"
	arrIN=(${IN// / })
	firstMd5=${arrIN[0]}
	
	second=$(md5sum ../gens/1/mutated/mutated_$counter)
	
	IN="$second"
	arrIN=(${IN// / })
	secondMd5=${arrIN[0]}
	
	IN="$i"
        arrIN=(${IN//\/1\// })
        pathVar=${arrIN[1]}
	
	mysql --user=genetic --password=Str1ktG3h31^^ genetic << EOF
INSERT INTO genetic (\`hash\`, \`path\`, \`mutatee\`) VALUES ("$secondMd5", "1/$pathVar", "$firstMd5");
EOF
	
	counter=$((counter+1))
done
