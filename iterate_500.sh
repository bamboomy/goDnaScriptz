
before=$(date)

for i in {500..749}
do
	cd /home/sander/genetic/pit/pit$i
	./battle.sh $i
done

after=$(date)

echo $before

echo $after
