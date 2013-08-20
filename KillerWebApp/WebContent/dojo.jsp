<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Test</title>

	<!-- load Dojo -->
    <script src="//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojo/dojo.js"
               data-dojo-config="async: true"></script>

	<style type="text/css">
		@import "//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojox/grid/resources/Grid.css";
		@import "//ajax.googleapis.com/ajax/libs/dojo/1.9.1/dojox/grid/resources/claroGrid.css";
		
		/*Grid needs an explicit height by default*/
		#gridDiv {
    		height: 20em;
		}		
		.dojoxGrid table {
  			margin: 0;
		}				
	</style>
	

	<script>
  require(['dojo/_base/lang', 'dojox/grid/DataGrid', 'dojo/data/ItemFileWriteStore', 'dojo/dom', 'dojo/json', 
           'dojo/domReady!'],
    function(lang, DataGrid, ItemFileWriteStore, dom){

    /*set up data store
    var data = {
      identifier: "id",
      items: []
    };
    var data_list = [
      { col1: "normal", col2: false, col3: 'But are not followed by two hexadecimal', col4: 29.91},
      { col1: "important", col2: false, col3: 'Because a % sign always indicates', col4: 9.33},
      { col1: "important", col2: false, col3: 'Signs can be selectively', col4: 19.34}
    ];
    var rows = 5;
    for(var i = 0, l = data_list.length; i < rows; i++){
        data.items.push(lang.mixin({ id: i+1 }, data_list[i%l]));
    }
    */
    
    var str = '{"identifier": "id","items": [{"id": 1,"col1": "normal","col2": false,"col3": "But are not followed by two hexadecimal","col4": 29.91}, {"id": 2,"col1": "important","col2": false,"col3": "Because a % sign always indicates","col4": 9.33}]}';
    
    var myJSONObject = JSON.parse(str);
    
    console.log(JSON.stringify(myJSONObject));
    
    var store = new ItemFileWriteStore({data: myJSONObject});

    /*set up layout*/
    var layout = [[
      {'name': 'Column 1', 'field': 'id', 'width': '100px'},
      {'name': 'Column 2', 'field': 'col2', 'width': '100px'},
      {'name': 'Column 3', 'field': 'col3', 'width': '200px'},
      {'name': 'Column 4', 'field': 'col4', 'width': '150px'}
    ]];

    /*create a new grid*/
    var grid = new DataGrid({
        id: 'grid',
        store: store,
        structure: layout,
        autoWidth: true,
        rowSelector: '20px'});

        /*append the new grid to the div*/
        grid.placeAt("gridDiv");

        /*Call startup() to render the grid*/
        grid.startup();
});
	</script>	
	
</head>

<body>

    <h1 id="greeting">Hello Grid</h1>
    
    <div id="gridDiv"></div>
    
	
</body>
</html>