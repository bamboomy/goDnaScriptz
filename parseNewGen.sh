
before=$(date)

counter=1

stop=false

for i in ../gens/1/children/child*
do

	if ! ./two.sh $i 0 $counter; then
	
		stop=true
		
		break
	fi
	
	echo $i 0 $counter
	
	counter=$((counter+1))
done

if [ "$stop" = "false" ]; then

	for i in ../gens/1/mutated/*
	do

		if ! ./two.sh $i 0 $counter; then

                	stop=true

	                break
        	fi

	        echo $i 0 $counter

        	counter=$((counter+1))
	done

fi

after=$(date)

echo $before

echo $after
