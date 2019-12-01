<%--
  Created by IntelliJ IDEA.
  User: eakpa
  Date: 11/11/2019
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Typical forms page content</title>
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans&display=swap" rel="stylesheet">
    <style><%@include file="/WEB-INF/views/styles/forms.css"%></style>
<%--    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>--%>
</head>
<body>
<h1>Filing a Claim Procedure</h1>
<form id="fileClaim" action= "/file.co" method="post">
    <!--Progress bar -->
    <ul id="progressbar">
        <li class="active">Claimant information</li>
        <li>Defendant information</li>
        <li>Claim Details</li>
        <li>Claim Documents</li>
    </ul>
    <br><br><br>
    <div id= "one">
        <p>Are you an individual, a law firm or an organisation? <strong>*</strong></p><br>
        <div class="rad">
            <input class= "individual" type="radio" name="radio" id="yes">
            <p>An individual</p>
            <input class="group" type="radio" name="radio" id="no">
            <p>A law firm or an organization</p>
            </div>
            <button class="next" name="next" type="button" style="margin-top: 5%; margin-left: 75%;" onclick="checked()"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val1" style="display: none;">
        <p>What is your full name? <strong>*</strong></p><br>
        <div class="inp">
                <p>First and middle name</p>
                <input class="try-out" name="claimantName" type="text" required>
                <p>Surname</p>
                <input class="try-out" name="claimantSurname"type="text" required>
                <p>Trading name or <br>representative capacity(if any)</p>
                <input class="try-out" name="claimantTradingName" type="text" required>
            </div>
        <button class="previous" name="prev" onclick="prevI()" type="button"><strong>PREVIOUS</strong></button>
        <button class="next" name="next" onclick="next1()" type="button"><strong>NEXT</strong></button>
    </div>
    <div class="pages" id="val2" style="display: none;">
            <p>What is the name of the law firm or organisation?  <strong>*</strong></p><br>
            <div class="inp">
                <p>Name</p>
                <input name="claimantName" type="text" required>
                <p>Firm or organisation type</p>
                <input name="claimantOrganisationType" type="text" required>
                <p>Registration number</p>
                <input type="text" required>
<%--                <p>Trading name (if any)</p>--%>
<%--                <input name="claimantTradingName" type="text">--%>
            </div>
            <button name="prev" class="previous" onclick="prevII()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next" onclick="nextI()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="two" style="display: none;">
            <p>Is your client an individual, a law firm or an organisation? <strong>*</strong></p><br>
            <div class="rad">
                <input class= "individual" type="radio" name="radio" id="yess">
                <p>An individual</p>
                <input class="group" type="radio" name="radio" id="noo">
                <p>A law firm or an organization</p>
            </div>
            <button name="prev" class="previous" onclick="prevone()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="checkedd()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val11" style="display: none;">
            <p>What is your client's full name? <strong>*</strong></p><br>
            <div class="inp">
                <p>First and middle name</p>
                <input name="clientName" type="text">
                <p>Surname</p>
                <input name="clientSurname" type="text">
                <p>Trading name or <br>representative capacity(if any)</p>
                <input name="clientTradingName" type="text">
            </div>
            <button name="prev" class="previous" onclick="prev2()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next2()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val22" style="display: none;">
            <p>What is the name of your client's company or organisation? <strong>*</strong></p><br>
            <div class="inp">
                <p>Name</p>
                <input name="clientName" type="text">
                <p>Firm or organisation type</p>
                <input name="clientOrganisationType" type="text">
                <p>Trading name (if any)</p>
                <input name="clientTradingName" type="text">
            </div>
            <button name="prev" class="previous" onclick="previ()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="nexti()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="three" style="display: none;">
        <p>How will you prefer to be contacted by the court? <strong>(pick one)</strong></p>
            <div class="rad">
                <input class= "individual" type="radio" name="radio" id="yesss">
                <p>By email</p>
                <input class="group" type="radio" name="radio" id="nooo">
                <p>By post</p>
            </div>
            <button name="prev" class="previous" onclick="prevtwo()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" onclick="checkeddd()" class="next position" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val111" style="display: none;">
            <p>Enter your email address <strong>*</strong></p>
            <div class="inp">
                <p>Email Address</p>
                <input name="claimantEmailAddress" type="email">
            </div>
            <button name="prev" class="previous" onclick="prev3()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next3()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val222" style="display: none;">
        <p>Enter your physical address <strong>*</strong></p>
            <div class="inp">
                <p>Physical Address</p>
                <input name="claimantPhysicalAddress" type="text">
            </div>
            <button name="prev" class="previous" onclick="prevIII()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="nextIII()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="four" style="display: none;">
        <p>Is the defendant of this claim an individual, a company or an organisation? <strong>*</strong></p><br>
            <div class="rad">
                <input class= "individual" type="radio" name="radio" id="yessss">
                <p>An individual</p>
                <input class="group" type="radio" name="radio" id="noooo">
                <p>A company or an organization</p>
            </div>
            <button name="prev" class="previous" onclick="prevthree()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="checkedddd()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val1111" style="display: none;">
            <p>What is the defendant's full name? <strong>*</strong></p><br>
            <div class="inp">
                <p>First and middle name</p>
                <input name="defendantName" type="text">
                <p>Surname</p>
                <input name="defendantSurname" type="text">
                <p>Trading name or <br>representative capacity(if any)</p>
                <input name="defendantTradingName" type="text">
            </div>
            <button name="prev" class="previous" onclick="prev4()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next4()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val2222" style="display: none;">
            <p>What is the defendant's company or organisation?  <strong>*</strong></p><br>
            <div class="inp">
                <p>Name</p>
                <input name="defendantName" type="text">
                <p>Firm or organisation type</p>
                <input name="defendantOrganisationType" type="text">
                <!--p>Registration number</p>
                <input type="text"-->
                <p>Trading name (if any)</p>
                <input name="defendantTradingName" type="text">
            </div>
            <button name="prev" class="previous" onclick="prevIV()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="nextIV()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="five" style="display: none;">
        <p>Would you like the court to serve this claim on your behalf?  <strong>*</strong></p><br>
        <div class="rad">
            <input class= "individual" type="radio" name="radio" id="yesssss">
            <p>Yes</p>
            <input class="group" type="radio" name="radio" id="nooooo">
            <p>No</p>
        </div>
        <button name="prev" class="previous" onclick="prevfour()" type="button"><strong>PREVIOUS</strong></button>
        <button name="next" class="next position" onclick="checkeddddd()" type="button"><strong>NEXT</strong></button>
    </div>
    <div class="pages" id="val11111" style="display: none;">
            <p>What is the defendant's contact details? <strong>*</strong></p><br>
            <div class="inp">
                <p>Address</p>
                <input name="defendantAddress" type="text">
                <p>Local Government Area</p>
                <input name="defendantLGA" type="text">
                <p>Email Address</p>
                <input name="defendantEmail" type="email"> <!--LIMITATION: ADD ANOTHER DEFENDANT-->
            </div>
            <button name="prev" class="previous" onclick="prev5()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next5()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="val22222" style="display: none;">
            <p>What is the background of the claim? <strong>*</strong></p>
            <div class="inp">
                <p>Briefly describe the essential facts about the story behind this claim.</p>
                <input name="briefDescription" type="textbox">
            </div>
            <button name="prev" class="previous" onclick="prevV()"type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="nextV()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="six" style="display: none;">
            <p>What steps have you taken to try settle out of court with the defendant?  <strong>*</strong></p><br>
            <div class="rad">
                <input class= "check" type="checkbox" name="checkbox">
                <p>Tried to settle amicably with other party</p>
                <input class="check" type="checkbox" name="checkbox">
                <p>Alternative Dispute Resolution (ADR)</p>
            </div>
            <button name="prev" class="previous" onclick="prev6()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next6()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="seven" style="display: none;">
            <div>
                <p>Attach statement of claim <strong>*</strong></p>
                <input name="statementOfClaim" type="file">
                <p>Attach statements of oaths of witness(es) <strong>*</strong></p>
                <input name="oathOfWitness" type="file">
            </div>
            <button name="prev" class="previous" onclick="prev7()" type="button"><strong>PREVIOUS</strong></button>
            <button name="next" class="next position" onclick="next7()" type="button"><strong>NEXT</strong></button>
        </div>
    <div class="pages" id="eight" style="display: none;">
            <div>
                <p>Attach other relevant documents to the claim <strong>*</strong></p>
                <input name="relevantDocument" type="file">
            </div>
            <button name="prev" class="previous" onclick="prev8()" type="button"><strong>PREVIOUS</strong></button>
            <button name="submit" class="position next-page" onsubmit="final()" type="submit"><strong>SUBMIT</strong></button>
        </div>
</form>
<script src="/javascript/progressbar.js" type="text/javascript"></script>
</body>
</html>