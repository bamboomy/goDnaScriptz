
for i in {3..1000}
do
	./gen.sh $i
	
#	./purge.sh

	if test -f "cooldown"; then
		echo "cooling down..."
		break
	fi
done
