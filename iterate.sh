
before=$(date)

counter=1

for i in {1..110}
do
#	if (((($counter%10)) < "9"))
#        then	
		cd /home/sander/genetic/pit/pit$i
		./battle.sh $i 
#	else
#		cd /home/sander/genetic/pit/pit$i
 #               ./battle.sh $i &
                
  #              wait
#	fi
	
	counter=$((counter+1))
done

wait

after=$(date)

echo $before

echo $after
