
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path FROM genetic ORDER BY score DESC limit 100;")

echo "$output"

while read p; do
  echo "line: $p"
  
  cp ../gens/$p ../gens/1/parents/
  
done <<< "$output"