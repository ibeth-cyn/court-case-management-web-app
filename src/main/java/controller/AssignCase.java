package controller;

import dao.CaseDB;
import dao.UserDB;
import model.Case;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public class AssignCase {

    UserDB judges = new UserDB();

    public AssignCase() throws InvalidKeySpecException, NoSuchAlgorithmException {
    }

    public void assignCases(CaseDB getCases){

        List<Case> cases = getCases.getJudgesCases();

        for(Case c: cases){

        }
    }
}
