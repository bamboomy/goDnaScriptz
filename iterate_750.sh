
before=$(date)

for i in {750..1000}
do
	cd /home/sander/genetic/pit/pit$i
	./battle.sh $i
done

after=$(date)

echo $before

echo $after
