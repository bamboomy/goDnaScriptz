
output=$(mysql genetic --user=genetic --password=Str1ktG3h31^^ -se "SELECT path FROM genetic ORDER BY score DESC limit 1000;")

counter=0
rand=$(($RANDOM/2000))

line_counter=0

while read p; do

        res=$((($counter + $rand) %100))
        
        if ! (($res)) 
        then 
        	echo $p
        	cp ../gens/$p ../gens/1/mutaterz/mutatee_$line_counter
        	rand=$(($RANDOM/2000))
        	line_counter=$((line_counter+1))
        fi
        
        if [[ line_counter -eq 10 ]]
        then
        	break
        fi
        
  counter=$((counter+1))

done <<< "$output"