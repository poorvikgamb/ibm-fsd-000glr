var rIndex,
                table = document.getElementById("table");
            
            // check the empty input
            function checkEmptyInput()
            {
                var isEmpty = false,
                    Tname = document.getElementById("Tname").value,
                    S1 = document.getElementById("S1").value,
                    S2 = document.getElementById("S2").value,
                    S3 = document.getElementById("S2").value;
            
                if(Tname == " "){
                    alert("Trainer must enter his name");
                    isEmpty = true;
                }
                else if(S1 == " "){
                    alert("Should opt atleast two subjects");
                    isEmpty = true;
                }
                else if(S2 == " "){
                    alert("Should opt atleast two subjects");
                    isEmpty = true;
                }
                else if(S2 == S1){
                    alert("Two subjects cannot be the same");
                    isEmpty = true;
                }
                 else if(S3 == S2 || S3 == S1){
                    alert("Two subjects cannot be the same");
                    isEmpty = true;
                }
                return isEmpty;
            }
            
            // add Row
            function addHtmlTableRow()
            {
                // get the table by id
                // create a new row and cells
                // get value from input text
                // set the values into row cell's
                if(!checkEmptyInput()){
                var newRow = table.insertRow(table.length),
                    cell1 = newRow.insertCell(0),
                    cell2 = newRow.insertCell(1),
                    cell3 = newRow.insertCell(2),
                    cell4 = newRow.insertCell(3),
                    Tname = document.getElementById("Tname").value,
                    S1 = document.getElementById("S1").value,
                    S2 = document.getElementById("S2").value,
                    S3 = document.getElementById("S3").value;
                    
                localStorage.setItem("name",document.getElementById("Tname").value);
                localStorage.setItem("Subject 1",document.getElementById("S1").value);
                localStorage.setItem("Subject 2",document.getElementById("S2").value);
                localStorage.setItem("Subject 3",document.getElementById("S3").value);


                cell1.innerHTML = Tname;
                cell2.innerHTML = S1;
                cell3.innerHTML = S2;
                cell4.innerHTML = S3;
                // call the function to set the event to the new row
                selectedRowToInput();
            }
            }
            
            // display selected row data into input text
            function selectedRowToInput()
            {
                
                for(var i = 1; i < table.rows.length; i++)
                {
                    table.rows[i].onclick = function()
                    {
                      // get the seected row index
                      rIndex = this.rowIndex;
                      document.getElementById("Tname").value = this.cells[0].innerHTML;
                      document.getElementById("S1").value = this.cells[1].innerHTML;
                      document.getElementById("S2").value = this.cells[2].innerHTML;
                      document.getElementById("S3").value = this.cells[3].innerHTML;
                    };
                }
            }
            selectedRowToInput();
            
            function editHtmlTbleSelectedRow()
            {
                var Tname = document.getElementById("Tname").value,
                    S1 = document.getElementById("S1").value,
                    S2 = document.getElementById("S2").value;
                    S3 = document.getElementById("S3").value;
               if(!checkEmptyInput()){
                table.rows[rIndex].cells[0].innerHTML = Tname;
                table.rows[rIndex].cells[1].innerHTML = S1;
                table.rows[rIndex].cells[2].innerHTML = S2;
                table.rows[rIndex].cells[3].innerHTML = S3;
              }
            }
            
            function removeSelectedRow()
            {
                table.deleteRow(rIndex);
                // clear input text
                document.getElementById("Tname").value = "";
                document.getElementById("S1").value = "";
                document.getElementById("S2").value = "";
                document.getElementById("S3").value = "";
            }