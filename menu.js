
    const _url = 'http://localhost:5500/items';
let dataz=''
fetch(_url,{
    headers : {
        'content-type':'application/json'
    }
})
.then(res=>res.json())
.then(items=>{
    createTable(items);
    
    dataz =items;
});  
function add(){
    items[0].currentquant +=1;
    createTable(dataz);
}
function sub(){
    items.currentquant -=1;
}
const createTable = (data) => {
    let rows = '';
    console.log(data.items);
    data.items.forEach(u => {
        rows += `<tr>
                    <td>${u.type}</td>
                    <td>${u.brand}</td>
                    <td>${u.price}</td>
                    <td>${u.quantity}</td>
                    <td>${u.currentquant}</td>
                    <td><input type="button" onclick="add()" value="ADD" id="btn1"></td>
                    <td><input type="button" onclick="sub()" value="REMOVE" id="btn2"></td>
                </tr>`
});

    const _table = `<table>
                        <tr>
                            <th>type</th>
                            <th>brand</th>
                            <th>price</th>
                            <th>quantity(available)</th>
                            <th>number</th>
                            <th>add2cart</th>
                            <th>removefromcart</th>
                        </tr>
                        ${rows}
                    </table>`
    document.getElementById('items').innerHTML = _table;
}
    


