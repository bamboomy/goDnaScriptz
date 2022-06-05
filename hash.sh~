

hash=$(md5sum $1)

echo $hash

IN="$hash"
arrIN=(${IN// / })
echo ${arrIN[0]}

mkdir ../pit/pit$2/hash/
touch ../pit/pit$2/hash/${arrIN[0]}
