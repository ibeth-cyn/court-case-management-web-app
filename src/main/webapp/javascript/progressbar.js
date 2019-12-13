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

//Second form radio input check
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

//Third form radio input check
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

//Fourth form radio input check
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

//Fifth form radio input check -
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

//Previous input field
function prevI() {
    document.getElementById("one").style.display ="block";
    document.getElementById("val1").style.display = "none";
    }

function prevII() {
    document.getElementById("one").style.display ="block";
    document.getElementById("val2").style.display = "none";
}

function prevone() {
    document.getElementById("one").style.display = "block";
    document.getElementById("two").style.display = "none";
}

function prev2() {
    document.getElementById("two").style.display ="block";
    document.getElementById("val11").style.display = "none";
}

function previ() {
    document.getElementById("two").style.display ="block";
    document.getElementById("val22").style.display = "none";
}

function prevtwo() {
    document.getElementById("two").style.display = "block";
    document.getElementById("three").style.display = "none";
}

function prev3() {
    document.getElementById("three").style.display ="block";
    document.getElementById("val111").style.display = "none";
}

function prevIII() {
    document.getElementById("three").style.display ="block";
    document.getElementById("val222").style.display = "none";
}

function prevthree() {
    document.getElementById("three").style.display = "block";
    document.getElementById("four").style.display = "none";
}

function prev4() {
    document.getElementById("four").style.display ="block";
    document.getElementById("val1111").style.display = "none";
}

function prevIV() {
    document.getElementById("four").style.display = "block";
    document.getElementById("val2222").style.display = "none";
}

function prevfour() {
    document.getElementById("four").style.display = "block";
    document.getElementById("five").style.display = "none";
}

function prev5() {
    document.getElementById("five").style.display = "block";
    document.getElementById("val11111").style.display = "none";
}

function prevV() {
    document.getElementById("five").style.display = "block";
    document.getElementById("val22222").style.display = "none";
}

// function prev6() {
//     document.getElementById("five").style.display = "block";
//     document.getElementById("six").style.display = "none";
// }
//
// function prev7() {
//     document.getElementById("six").style.display = "block";
//     document.getElementById("seven").style.display = "none";
// }
//
// function prev8() {
//     document.getElementById("seven").style.display = "block";
//     document.getElementById("eight").style.display = "none";
// }


//Next input field
//Reference - https://developer.mozilla.org/en-US/docs/Learn/HTML/Forms/Form_validation
//Reference - https://itnext.io/https-medium-com-joshstudley-form-field-validation-with-html-and-a-little-javascript-1bda6a4a4c8c
function next1() {

    var x = document.getElementById("val1");
    var y = x.getElementsByTagName("input");

    for(var i = 0; i<y.length; i++){
        if(y[i].value.length === 0) {
            alert("Please fill out the form fields");
            return false;
        } else{
            document.getElementById("two").style.display = "block";
            document.getElementById("val1").style.display="none";
        }

    }
}

function nextI() {
    var x = document.getElementById("val2");
    var y = x.getElementsByTagName("input");

    for (var i = 0; i< y.length; i++){
        if(y[i].value.length === 0){
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("two").style.display = "block";
            document.getElementById("val2").style.display="none";
        }
    }
}

function next2() {

    var x = document.getElementById("val11");
    var y = x.getElementsByTagName("input");

    for(var i = 0; i<y.length; i++){
        if(y[i].value.length === 0){
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("three").style.display = "block";
            document.getElementById("val11").style.display="none";
        }
    }
}

function nexti() {

    var x = document.getElementById("val22");
    var y = x.getElementsByTagName("input");

    for(var i =0; i<y.length; i++){
        if(y[i].value.length === 0) {
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("three").style.display = "block";
            document.getElementById("val22").style.display="none";
        }
    }
}

function next3() {

    var x = document.getElementById("val111");
    var y = x.getElementsByTagName("input");

    for(var i = 0; i<y.length; i++){
        if(y[i].value.length === 0 ){
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("four").style.display = "block";
            document.getElementById("val111").style.display="none";
        }
    }
}

function nextIII() {

    var x = document.getElementById("val222");
    var y = x.getElementsByTagName("input");

    for(var i =0; i<y.length; i++){
        if(y[i].value.length === 0){
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("four").style.display = "block";
            document.getElementById("val222").style.display="none";
        }
    }
}

function next4() {

    var x = document.getElementById("val1111");
    var y = x.getElementsByTagName("input");

    for(var i =0; i<y.length; i++){
        if(y[i].value.length === 0){
            alert("Please fill out the form fields");
            return false;
        }else {
            document.getElementById("five").style.display = "block";
            document.getElementById("val1111").style.display="none";
        }
    }
}

function nextIV() {

    var x = document.getElementById("val2222");
    var y = x.getElementsByTagName("input");

    for(var i =0; i<y.length; i++) {
        if (y[i].value.length === 0) {
            alert("Please fill out the form fields");
            return false;
        } else {
            document.getElementById("five").style.display = "block";
            document.getElementById("val2222").style.display="none";
        }
    }
}

function next5() {

    var x = document.getElementById("val11111");
    var y = x.getElementsByTagName("input");

    for(var i = 0; i<y.length; i++){
        if(y[i].value.length === 0){
            alert("Please fill out the form fields");
            return false;
        }else{
            document.getElementById("val22222").style.display = "block";
            document.getElementById("val11111").style.display = "none";
        }
    }
}

// function nextV() {
//
//     var x = document.getElementById("val22222");
//     var y = x.getElementsByTagName("input");
//
//     for(var i = 0; i<y.length; i++){
//         if(y[i].value.length === 0){
//             alert("Please fill out the form fields");
//             return false;
//         }else{
//             document.getElementById("six").style.display = "block";
//             document.getElementById("val22222").style.display = "none";
//         }
//     }
// }
//
// function next6() {
//
//     var x = document.getElementById("six");
//     var y = x.getElementsByTagName("input");
//
//     for(var i =0; i<y.length; i++){
//         if(y[i].value.length === 0){
//             alert("Please fill out the form fields");
//             return false;
//         }else{
//             document.getElementById("seven").style.display = "block";
//             document.getElementById("six").style.display = "none";
//         }
//     }
// }
//
// function next7() {
//
//     var x = document.getElementById("seven");
//     var y = x.getElementsByTagName("input");
//
//     for (var i = 0; i < y.length; i++) {
//         if (y[i].value.length === 0) {
//             alert("Please fill out the form fields");
//             return false;
//         } else {
//             document.getElementById("eight").style.display = "block";
//             document.getElementById("seven").style.display = "none";
//         }
//     }
// }

