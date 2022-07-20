
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path, hash FROM genetic ORDER BY score DESC limit 100;")

echo "$output"

parsed=$(echo "$output" | sed -r 's/\t/+/g')

echo "$parsed"

counter=0

while read p; do
#  echo "line: $p"

	res=$((counter%2))  
	
	readarray -d + -t strarr <<< "$p"
	
	cp ../gens/${strarr[0]} ../gens/$1/parents/$res/${strarr[1]}
	
 # cp ../gens/$p ../gens/1/parents/$res/
  counter=$((counter+1))
  
done <<< "$parsed"