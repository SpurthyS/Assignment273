package domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Spurthy on 3/1/2015.
 */
public class PollRepository {

    private Map<String, Poll> pollsList = new HashMap<String, Poll>();

    private Map<String, PollWithoutResults> pollsWoResultsList = new HashMap<String, PollWithoutResults>();



    public Map<String, Poll> getPollsList() {
        return pollsList;
    }

    public void setPollsList(Map<String, Poll> pollsList) {
        this.pollsList = pollsList;
    }

    public Map<String, PollWithoutResults> getPollsWoResultsList() {
        return pollsWoResultsList;
    }

    public void setPollsWoResultsList(Map<String, PollWithoutResults> pollsWoResultsList) {
        this.pollsWoResultsList = pollsWoResultsList;
    }



    public void addPoll(Poll p){

        pollsList.put(p.getId(),p);
        pollsWoResultsList.put(p.getId(), new PollWithoutResults(p.getId(),p.getQuestion(),p.getChoice(),p.getStarted_at(),p.getExpired_at()));
    }

    public void removePoll(Poll p){
       pollsList.remove(p.getId());
       pollsWoResultsList.remove(p.getId());
    }

    public PollRepository() {
    }

    public Poll findPollInList(String id){
        for(Map.Entry<String,Poll> entry : pollsList.entrySet()){
            if(entry.getKey().equals(id)){
                return entry.getValue();
            }
        }
        return null;
    }

    public PollWithoutResults findPollWoResultInList(String id){
        for(Map.Entry<String,PollWithoutResults> entry : pollsWoResultsList.entrySet()){
            if(entry.getKey().equals(id)){
                return entry.getValue();
            }
        }
        return null;
    }
}
