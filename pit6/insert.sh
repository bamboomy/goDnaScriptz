
mysql --user=genetic --password=Str1ktG3h31^^ genetic << EOF
INSERT INTO genetic (\`hash\`, \`path\`, \`score\`) VALUES ("$1", "0/dna$2", $3);
EOF
