
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT score FROM genetic ORDER BY score DESC limit 1000,1;")

echo $output

remove=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path FROM genetic where (score < $output or score is null) and purged = 'N';")

rm purgeOut.sh

for i in $remove
do
	echo rm ../gens/$i >> purgeOut.sh
done

chmod 700 purgeOut.sh
./purgeOut.sh

rm -Rf ../gens/*/parents
rm -Rf ../gens/*/mutaterz