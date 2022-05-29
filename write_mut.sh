
cd ../gens/1/children/

#java -jar ../../../jars/pairer.jar ../parents/dna101 ../parents/dna103 test1 test2

rm ../../../scriptz/pair_first_parent.sh

var0=$(cat ../../../scriptz/pair_jars.txt)
var1=$(ls ../parents/0)

paste -d + <(tr '\n' '\n' <<<"$var0") <(tr ' ' '\n' <<<"$var1") > ../../../scriptz/temp_pair.sh

while read p; do
  echo "$p ../parents/1/" | sed -r 's/\+//g' >> ../../../scriptz/pair_first_parent.sh
done <../../../scriptz/temp_pair.sh

var0=$(cat ../../../scriptz/pair_first_parent.sh)
var2=$(ls ../parents/1)

paste -d + <(tr '\n' '\n' <<<"$var0") <(tr ' ' '\n' <<<"$var2") > ../../../scriptz/final_pair_temp.sh

while read p; do
  echo "$p child_1_$RANDOM child_2_$RANDOM" | sed -r 's/\+//g' >> final_pair.sh
done <../../../scriptz/final_pair_temp.sh

chmod 700 final_pair.sh

cp ../../../scriptz/pair_and_insert.sh .