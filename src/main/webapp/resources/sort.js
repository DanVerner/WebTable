/**
 * Created by Denis on 12.04.2017.
 */
$(document).ready(function() {
    $("#myTable").tablesorter();
});


function count(index) {
    var table = document.getElementsByTagName("table")[0], sum = 0;
    var tr = table.getElementsByTagName("tr");
    var len = 0, i = tr.length;
    while(i--) {
        if(tr[i].childNodes[index] != null) {
            if(+tr[i].childNodes[index].innerHTML || +tr[i].childNodes[index].childNodes[0].innerHTML ){
                sum += +tr[i].childNodes[index].innerHTML || +tr[i].childNodes[index].childNodes[0].innerHTML;
                len++;
            }
        }
    }
    if(index == 5){
        var element = document.getElementById("label");
        element.innerHTML = "Средний рост равен: "

        var element = document.getElementById("count");
        element.innerHTML = "" + sum/len + " см."
    }
    if(index == 7){
        var element = document.getElementById("label");
        element.innerHTML = "Средний вес равен: "

        var element = document.getElementById("count");
        element.innerHTML = "" + sum/len + " кг."
    }
}

