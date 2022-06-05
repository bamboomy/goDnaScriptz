

./fight.sh

total=$(cat total)

for i in {1..3} 
do
	rm total
	./fight.sh
	new=$(cat total)
	total=$(($total + $new))
	
	if (( total < -2000 ));then
		break
	fi
done

echo $total

hash=$(ls hash)

echo $hash

#./insert.sh $hash $1 $total

./update.sh $hash $1 $total
