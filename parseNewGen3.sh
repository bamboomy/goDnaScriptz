
before=$(date)

counter=101

for i in ../gens/$1/mutated/*
do
	echo $i 0 $counter | tee >> log

	./two.sh $i $(($counter%3)) $counter
		
       	counter=$((counter+1))
done

after=$(date)

echo $before

echo $after
