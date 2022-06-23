
before=$(date)

counter=1

stop=false

for i in ../gens/$1/children/child*
do

	echo $i 0 $counter

	./two.sh $i 0 $counter
	
	counter=$((counter+1))
done

	for i in ../gens/$1/mutated/*
	do

	        echo $i 0 $counter

		./two.sh $i 0 $counter

        	counter=$((counter+1))
	done

after=$(date)

echo $before

echo $after
