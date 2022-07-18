
for i in {1..1000}
do
	./gen.sh $i
	if [ $? -ne 0 ]
        then
        	cd /var/www/html
        	cp evolution_off.php evolution.php
            exit -1
        fi
	
	./purge.sh

	if test -f "cooldown"; then
		echo "cooling down..."
		break
	fi
done
