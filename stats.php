<?php
$output = shell_exec('df -h');
$before = explode("dev/sda", $output);
$after = explode("dev/loop0", $before[1]);
echo "<pre>$after[0]</pre>";
include 'evolution.php';
include 'hospital.php';
?>