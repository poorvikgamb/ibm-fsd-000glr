var ttIndex,
table1 = document.getElementById("timetable");

// check the empty input
function checkEmptyInputTT()
{
var isEmpty = false,
    Tname = document.getElementById("Tname1").value,
    S4 = document.getElementById("S4").value,
    S5 = document.getElementById("TS").value;
    

if(Tname1 === ""){
    alert("Trainer should enter his name");
    isEmpty = true;
}
else if(S4 === ""){
    alert("Trainer should select the subject for the session");
    isEmpty = true;
}
else if(TS === ""){
    alert("Trainer should know select time slot for when he wants to take the session");
    isEmpty = true;
}
return isEmpty;
}

// add Row
function addHtmlTableRowTT()
{
// get the table by id
// create a new row and cells
// get value from input text
// set the values into row cell's
if(!checkEmptyInputTT()){
var newRow = table1.insertRow(table1.length),
    cell1 = newRow.insertCell(0),
    cell2 = newRow.insertCell(1),
    cell3 = newRow.insertCell(2),
    Tname = document.getElementById("Tname1").value,
    S1 = document.getElementById("S4").value,
    S2 = document.getElementById("TS").value;
    

cell1.innerHTML = Tname1;
cell2.innerHTML = S4;
cell3.innerHTML = TS;
// call the function to set the event to the new row
selectedRowToInput();
}
}

// display selected row data into input text
function selectedRowToInputTT()
{

for(var i = 1; i < localStorage.length; i++)
{
    table1.rows[i].onclick = function()
    {
      // get the seected row index
      ttIndex = this.row1Index;
      document.getElementById("Tname1").value = this.cells[0].innerHTML;
      if(getElementById("S4").value == (getElementById("S1".value) || getElementById("S2").value || getElementById("S3").value)){
        document.getElementById("S4").value = this.cells[1].innerHTML;
      }
      else{
          alert("Trainer needs to select subjects which he has opted to teach");
      }
      
      document.getElementById("TS").value = this.cells[2].innerHTML;
    };
    selectedRowToInputTT();
}
}


function editHtmlTbleSelectedRowTT()
{
var Tname1 = document.getElementById("Tname1").value,
    S4 = document.getElementById("S4").value,
    TS = document.getElementById("TS").value;
if(!checkEmptyInput()){
table1.rows[ttIndex].cells[0].innerHTML = Tname1;
table1.rows[ttIndex].cells[1].innerHTML = S4;
table1.rows[ttIndex].cells[2].innerHTML = TS;
}
}

function removeSelectedRowTT()
{
table1.deleteRow(rIndex);
// clear input text
document.getElementById("Tname1").value = "";
document.getElementById("S4").value = "";
document.getElementById("TS").value = "";
}