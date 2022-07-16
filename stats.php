<?php
$output = shell_exec('df -h');
$before = explode("dev/sda1", $output);
echo "<pre>$before[1]</pre>";
?>