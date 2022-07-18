
before=$(date)

counter=1

stop=false

for i in ../gens/$1/children/child*
do

	echo $i 0 $counter

	if (((($counter%3)) < "2"))
	then

		./two.sh $i $(($counter%3)) $counter &
	else
		./two.sh $i $(($counter%3)) $counter &

		wait
	fi
	
	counter=$((counter+1))
done

wait

	for i in ../gens/$1/mutated/*
	do

	        echo $i 0 $counter
	        
	        if (((($counter%3)) < "2"))
	        then

			./two.sh $i $(($counter%3)) $counter &
		else
			./two.sh $i $(($counter%3)) $counter &
			
			wait
		fi

        	counter=$((counter+1))
	done

wait

after=$(date)

echo $before

echo $after
