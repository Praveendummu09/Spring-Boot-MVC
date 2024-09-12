/**
 * 
 */

 function doValidation(frm){
	
	//read form comp values
	let name=frm.ename.value;
	let desg=frm.job.value;
	let salary=frm.sal.value;
	let deptno=frm.deptno.value;
	let isValid=true;
	//Wrie the client side validation logics
	if(name==""){//required rule
		document.getElementById("enameErr").innerHTML="EMployees name is mandatory";
		isValid=false;
	}
	else if(name.length<3 || name.length>15)
	{
		document.getElementById("enameErr").innerHTML="Employee name must contain >=3 chars and <=15 chars";
		isValid=false;
	}
	if(desg==""){//required rule
		document.getElementById("jobErr").innerHTML="EMployees Job is mandatory";
		isValid=false;
	}
	else if(desg.length<3 || desg.length>10)
	{
		document.getElementById("jobErr").innerHTML="Employee job must contain >=3 chars and <=10 chars";
		isValid=false;
	}
	if(salary=="")
	{
		document.getElementById("salErr").innerHTML="EMployees Salary is mandatory";
		isValid=false;
	}
	else if(salary<=2000 || salary>=200000)
	{
		document.getElementById("salErr").innerHTML="Employee cleint salary must be in range of 2000 chars and 200000 chars";
		isValid=false;
	}
	else if(isNaN(salary))
	{
		document.getElementById("salErr").innerHTML="Employee Salary must be in in numerics";
		isValid=false;
	}
	if(deptno=="")
	{
		document.getElementById("deptnoErr").innerHTML="EMployees Deptno is mandatory";
		isValid=false;
	}
	else if(deptno<=10 || deptno>=100)
	{
		document.getElementById("deptnoErr").innerHTML="Employee Deptno must be in range of 10 chars and 100 chars";
		isValid=false;
	}
	else if(isNaN(deptno))
	{
		document.getElementById("deptnoErr").innerHTML="Employee deptno must be in in numerics";
		isValid=false;
	}
	frm.vflag.value="yes";
	return isValid;
 }