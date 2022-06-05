
mysql --user=genetic --password=Str1ktG3h31^^ genetic << EOF
update genetic set score = "$3" where hash = "$1";
EOF
