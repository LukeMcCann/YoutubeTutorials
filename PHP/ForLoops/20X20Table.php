<!Doctype>
<html lang="en">
<head>
</head>
<body>
<table border = 1, width = "200">
<?php 
    for($i = 1; $i <= 20; $i++)
    {
    	print("<tr>");
    	for($x = 1; $x <= 20; $x++)
    	{
    		print("<td>");
    		print($i*$x);
    		print("</td>");
    	}
    	print("</tr>");
    }
?>
</table>
</body>
</html>