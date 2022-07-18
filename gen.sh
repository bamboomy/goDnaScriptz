
./stub.sh $1
./select.sh $1
./select_mut.sh $1
./write_pair.sh $1
cd ../gens/$1/children/
./final_pair.sh
cd ../../../scriptz/
./mut.sh $1
before=$(date)
./parseNewGen2.sh $1
if [ $? -ne 0 ]
then
	exit -1
fi
after=$(date)
./iterate.sh
echo $before
echo $after
