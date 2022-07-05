package com.exercises.domain.classes.selection.talent;

import com.exercises.domain.classes.selection.talent.candidate.Candidate;

public class ApplyWorkOffer {
    private WorkOffer workOffer;
    private Candidate[] candidates;

    public WorkOffer getWorkOffer() {
        return workOffer;
    }

    public void setWorkOffer(WorkOffer workOffer) {
        this.workOffer = workOffer;
    }

    public Candidate[] getCandidates() {
        return candidates;
    }

    public void setCandidates(Candidate[] candidates) {
        this.candidates = candidates;
    }

    public ApplyWorkOffer() {
        this.candidates = new Candidate[5];
    }
}
