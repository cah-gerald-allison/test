
	function setupForm(){
		lastNameField = eval("document.searchForm.lname");
		
		lastNameField.focus();
	}

	function clearForm(){
		lastNameField = eval("document.searchForm.lname");
		firstNameField = eval("document.searchForm.fname");
		dobField = eval("document.searchForm.dob");		
		
		lastNameField.value = "";
		firstNameField.value = "";
		dobField.value = "MM/DD/YYYY";
		setMessage("");
		
		lastNameField.focus();
	}	

   	function validateFormInputs(){
   		firstNameField = eval("document.searchForm.fname");
		lastNameField = eval("document.searchForm.lname");
		dobField = eval("document.searchForm.dob");		
   	
   		if (nullCheck(lastNameField, "last name") && nullCheck(firstNameField, "first name")  
   				&& nullCheck(dobField, "date of birth")
				&& matchCheck(dobField, "MM/DD/YYYY", "date of birth")) {
   				
   				if(dateCheck(dobField)) {
   					return true;
   				}
   				
   			return false;
   		}
   		return false;
	}
	
	function matchCheck(field, value, message){
		fieldValue = field.value;
		if (fieldValue == value){
			setMessage("Please enter "+ message +".");
			field.focus();
			return false;
		}
	
		return true;	
	}   	
   	
	function dateCheck(field){
		fieldValue = field.value;
		var dateParts = fieldValue.split("/");
		if(dateParts.length != 3){
			setMessage("Please use mm/dd/yyyy format for date.");
			field.focus();
			return false;
		}
		
		var month = dateParts[0];
		var day = dateParts[1];
		var year = dateParts[2];
		
		if(!monthCheck(month)) {
			setMessage("Please enter a valid month for the date.");
			field.focus();
			return false;		
		}
		
		if(!dayCheck(day)) {
			setMessage("Please enter a valid day for the date.");
			field.focus();
			return false;		
		}		

		if(!yearCheck(year)) {
			setMessage("Please enter a valid year for the date.");
			field.focus();
			return false;		
		}
		
		return true;
	}

	function monthCheck(val){
	
		var months = new Array();
		months[0]="01";
		months[1]="02";
		months[2]="03";
		months[3]="04";
		months[4]="05";
		months[5]="06";
		months[6]="07";
		months[7]="08";
		months[8]="09";
		months[9]="10";       
		months[10]="11";			
		months[11]="12";
		months[12]="1";
		months[13]="2";
		months[14]="3";
		months[15]="4";
		months[16]="5";
		months[17]="6";
		months[18]="7";
		months[19]="8";
		months[19]="9";		
		
      	var i = 0;
      	while (i < months.length) {
         	if (months[i] == val){
         		return true;
         	}
         	
         	i++;
      	}
				
		return false;
	}

	function dayCheck(val){
	
		var days = new Array();
		days[0]="01";
		days[1]="02";
		days[2]="03";
		days[3]="04";
		days[4]="05";
		days[5]="06";
		days[6]="07";
		days[7]="08";
		days[8]="09";
		days[9]="10";       
		days[10]="11";			
		days[11]="12";
		days[12]="13";
		days[13]="14";
		days[14]="15";
		days[15]="16";
		days[16]="17";
		days[17]="18";
		days[18]="19";
		days[19]="20";
		days[20]="21";
		days[21]="22";
		days[22]="23";
		days[23]="24";
		days[24]="25";
		days[25]="26";
		days[26]="27";
		days[27]="28";
		days[28]="29";
		days[29]="30";
		days[30]="31";
		days[31]="1";
		days[32]="2";
		days[33]="3";
		days[34]="4";
		days[35]="5";
		days[36]="6";
		days[37]="7";
		days[38]="8";
		days[39]="9";		
		
      	var i = 0;
      	while (i < days.length) {
         	if (days[i] == val){
         		return true;
         	}
         	
         	i++;
      	}	
	
		return false;
	}
	
	function yearCheck(val){
		
		if (val.length == 4 && val != "    " && !isNaN(val)) {

			var end = new Date().getFullYear();
			var start = end - 126;
			
			if(val > start && val < (end + 1)){
				return true;
			}
			
			return false;							
		}
		
		return false;
	}		

	function nullCheck(field,message){
		fieldValue = field.value;
		if (fieldValue == ""){
			setMessage("Please enter "+ message +".");
			field.focus();
			return false;
		}
	
		return true;	
	}
	
	function setMessage(message) {
		var textContent = document.getElementById('messageDiv');
		textContent.firstChild.data=message;
	}
