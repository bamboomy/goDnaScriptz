
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path FROM genetic ORDER BY score DESC limit 100;")

echo "$output"

