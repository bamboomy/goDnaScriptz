<?

$conn = new mysqli("46.101.182.12", "reader", "R34dOnl==", "genetic");

$sql = "select path, score from genetic order by score desc;";

$result = $conn->query($sql);

$sql2 = "select path from genetic where dt_add = (select max(dt_add) from genetic);";

$result2 = $conn->query($sql2);

$row = $result2->fetch_assoc();

$pieces = explode("/", $row['path']);

$sql3 = "select path, score from genetic where path like '".$pieces[0]."%' order by score desc;";

$result3 = $conn->query($sql3);

$sql4 = "select path, score from genetic where path like '".($pieces[0] - 1)."%' order by score desc;";

$result4 = $conn->query($sql4);
?>

<html>
<head>
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
	<script src="jquery-3.6.0.min.js"></script>
	<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
	<style>
		#effect100 {
			display: none;
			padding : 5px;
		}
		#effect1000 {
			display: none;
			padding : 5px;
		}
		#effect0 {
			display: none;
			padding : 5px;
		}
		#effect1 {
                        display: none;
                        padding : 5px;
                }
	</style>
	<script>
	
		const shown = [];
		shown[100] = false;
		shown[1000] = false;
		shown[0] = false;
		shown[1] = false;
			
		function toggle(suffix){
		
			if(shown[suffix]){
			
				$( "#effect"+suffix ).hide( "blind", {}, 500 );
			
			} else {
			
				$( "#effect"+suffix ).show( "blind", {}, 500 );
			}
			
			shown[suffix] = !shown[suffix];
		}
	</script>
</head>
<body>
<div style="position:absolute; top: 10px; left: 10px; border-style: solid; padding: 5px;">
<?
	echo "Current generation: ".$pieces[0]."th";
?>
</div>

<div style="position:absolute; top: 10px; right: 10px; border-style: solid; padding: 5px;">
<?
	$file = fopen ("http://46.101.182.12/stats.php", "r");
	while (!feof ($file)) {
	    $line = fgets ($file, 1024);
	    
	    echo $line;
	    
	    }
fclose($file);

?>
</div>


<center>
<h1>De superpagina :)</h1>
<div>
	<h3 onclick="toggle(100);">Top 100</h3>
	<div id="effect100">
<table>
<?

$counter = 1;

while($row = $result->fetch_assoc()){

		echo "<tr><td>".$counter."</td><td>".$row['path']."</td><td>".$row['score']."</td></tr>";

		if($counter++ >= 100){
			
			break;
		}
}

?>
</table>
    </div>
</div>
<div>
	<h3 onclick="toggle(1000);">Top 1000 (remainder)</h3>
	<div id="effect1000">
<table>
<?
while($row = $result->fetch_assoc()){

		echo "<tr><td>".$counter."</td><td>".$row['path']."</td><td>".$row['score']."</td></tr>";

		if($counter++ >= 1000){
			
			break;
		}
}
?>
</table>
    </div>
</div>
<div>
	<h3 onclick="toggle(0);">Most recent</h3>
	<div id="effect0">
<table>
<?
while($row = $result3->fetch_assoc()){

		echo "<tr><td>".$row['path']."</td><td>".$row['score']."</td></tr>";
}
?>
</table>
    </div>
</div>
<div>
        <h3 onclick="toggle(1);">The one before</h3>
        <div id="effect1">
<table>
<?
while($row = $result4->fetch_assoc()){

                echo "<tr><td>".$row['path']."</td><td>".$row['score']."</td></tr>";
}
?>
</table>
    </div>
</div>
<?
echo "jaj :)";
?>
</center>
</body>
</html>