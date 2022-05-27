timeout 10 ./twogtp.pl --white 'gnugo --mode gtp --level 0 --handicap 5' \
      --black 'java -cp ../pit5/log4j-1.2.17.jar:dummy.jar net.sf.gogui.tools.dummy.Main' \
       --sgffile foreplay.sgf --verbose 1 \
       --boardsize 9 --handicap 5
	   
result=$(gnugo --score aftermath -l foreplay001.sgf -o spot_out.sgf --situational-superko)

echo $result

NAME=${result%.5 points*}  # retain the part before the colon
NAME=${NAME##White wins by }  # retain the part after the last slas

SIGN="-"

if [[ "$NAME" == *"Black"* ]]; then
        NAME=${NAME##Black wins by }
        SIGN=""
fi

echo $SIGN$NAME

hash=$(ls hash)

echo $hash

if [[ "$NAME" == "" ]]; then
        NAME=5000
        SIGN="-"
fi

./insert.sh $hash $1 $SIGN$NAME
