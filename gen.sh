
./stub.sh $1
./select.sh $1
./select_mut.sh $1
./write_pair.sh $1
cd ../gens/$1/children/
./final_pair.sh
cd ../../../scriptz/
./mut.sh $1
before=$(date)
./parseNewGen.sh $1
after=$(date)
./iterate.sh
echo $before
echo $after
