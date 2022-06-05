for i in {1..110} 
do
	rm ../pit$i/foreplay001.sgf
	cp fight.sh battle.sh twogtp.pl update.sh insert.sh ../pit$i/
done
