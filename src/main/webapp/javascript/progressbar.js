//First form radio input check
function checked() {
    var yes = document.getElementById("yes").checked;
    var no = document.getElementById("no").checked;

    if(yes == false && no == false){
        alert("Please select an option");
        return false;
    } else if(yes == true){
        document.getElementById("val1").style.display ="block";
        document.getElementById("one").style.display = "none";
    }else if (no == true){
        document.getElementById("val2").style.display ="block";
        document.getElementById("one").style.display = "none";
    }
}

//First form radio input check -
function checkedd() {
    var yess = document.getElementById("yess").checked;
    var noo = document.getElementById("noo").checked;

    if(yess == false && noo == false){
        alert("Please select an option");
        return false;
    } else if(yess == true){
        document.getElementById("val11").style.display ="block";
        document.getElementById("two").style.display = "none";
    }else if (noo == true){
        document.getElementById("val22").style.display ="block";
        document.getElementById("two").style.display = "none";
    }
}

//Third form radio input check -
function checkeddd() {
    var yesss = document.getElementById("yesss").checked;
    var nooo = document.getElementById("nooo").checked;

    if(yesss == false && nooo == false){
        alert("Please select an option");
        return false;
    } else if(yesss == true){
        document.getElementById("val111").style.display ="block";
        document.getElementById("three").style.display = "none";
    }else if (nooo == true){
        document.getElementById("val222").style.display ="block";
        document.getElementById("three").style.display = "none";
    }
}

//Four form radio input check -
function checkedddd() {
    var yessss = document.getElementById("yessss").checked;
    var noooo = document.getElementById("noooo").checked;

    if(yessss == false && noooo == false){
        alert("Please select an option");
        return false;
    } else if(yessss == true){
        document.getElementById("val1111").style.display ="block";
        document.getElementById("four").style.display = "none";
    }else if (noooo == true){
        document.getElementById("val2222").style.display ="block";
        document.getElementById("four").style.display = "none";
    }
}

//Five form radio input check -
function checkeddddd() {
    var yesssss = document.getElementById("yesssss").checked;
    var nooooo = document.getElementById("nooooo").checked;

    if(yesssss == false && nooooo == false){
        alert("Please select an option");
        return false;
    } else if(yesssss == true){
        document.getElementById("val11111").style.display ="block";
        document.getElementById("five").style.display = "none";
    }else if (nooooo == true){
        document.getElementById("val22222").style.display ="block";
        document.getElementById("five").style.display = "none";
    }
}

//Move to and from the first text input
function prevI() {
    document.getElementById("one").style.display ="block";
    document.getElementById("val1").style.display = "none";
    }

function prevII() {
    document.getElementById("one").style.display ="block";
    document.getElementById("val2").style.display = "none";
}

function prev2() {
    document.getElementById("two").style.display ="block";
    document.getElementById("val11").style.display = "none";
}

function previ() {
    document.getElementById("two").style.display ="block";
    document.getElementById("val22").style.display = "none";
}

function prevone() {

}

function prev3() {
    document.getElementById("three").style.display ="block";
    document.getElementById("val111").style.display = "none";
}

function prevIII() {
    document.getElementById("three").style.display ="block";
    document.getElementById("val222").style.display = "none";
}

function prev4() {
    document.getElementById("four").style.display ="block";
    document.getElementById("val1111").style.display = "none";
}

function prevIV() {
    document.getElementById("four").style.display = "block";
    document.getElementById("val2222").style.display = "none";
}
//TODO: Include form validation in these methods
function next1() {
    document.getElementById("two").style.display = "block";
    document.getElementById("val1").style.display="none";
}

function nextI() {
    document.getElementById("two").style.display = "block";
    document.getElementById("val2").style.display="none";
}

function next2() {
    document.getElementById("three").style.display = "block";
    document.getElementById("val11").style.display="none";
}

function nexti() {
    document.getElementById("three").style.display = "block";
    document.getElementById("val22").style.display="none";
}

function next3() {
    document.getElementById("four").style.display = "block";
    document.getElementById("val111").style.display="none";
}

function nextIII() {
    document.getElementById("four").style.display = "block";
    document.getElementById("val222").style.display="none";
}

function next4() {
    document.getElementById("five").style.display = "block";
    document.getElementById("val1111").style.display="none";
}

function nextIV() {
    document.getElementById("five").style.display = "block";
    document.getElementById("val2222").style.display="none";
}

function formValidation(){

    // This function deals with validation of the form fields
    var x, y, i, valid = true;
    x = document.getElementsByClassName("pages");
    y = x.getElementsByTagName("input");

    // A loop that checks every input field in the current tab:
    for (i = 0; i < y.length; i++) {
        // If a field is empty...
        if (y[i].value == "") {
            // add an "invalid" class to the field:
            y[i].className += " invalid";
            // and set the current valid status to false
            valid = false;
        }
    }
    return valid; // return the valid status
}

