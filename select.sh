
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path FROM genetic ORDER BY score DESC limit 100;")

echo "$output"

counter=0

while read p; do
  echo "line: $p"

	res=$((counter%2))  
  cp ../gens/$p ../gens/1/parents/$res/
  counter=$((counter+1))
  
done <<< "$output"