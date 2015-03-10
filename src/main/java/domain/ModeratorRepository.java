package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Spurthy on 2/28/2015.
 */
public  class ModeratorRepository {

    private Map<Integer,Moderator> moderatorList= new HashMap<Integer,Moderator>();

    public ModeratorRepository() {

    }

    public Map<Integer,Moderator> getModeratorList() {
        return moderatorList;
    }

    public void setModeratorList(Map<Integer,Moderator> moderatorList) {
        this.moderatorList = moderatorList;
    }

    public Moderator findModeratorInList(Integer id){
        for(Map.Entry<Integer,Moderator> entry : moderatorList.entrySet()){
            if(entry.getKey() == id){
                return entry.getValue();
            }
        }
        return null;
    }

    public void updatePoll( Integer moderatorId, Poll poll){
        System.out.println(moderatorList);
        List<Poll> pollList = moderatorList.get(moderatorId).getPolls();
        System.out.println(pollList.toString());

        Poll pollToRemove = null;

        for (Poll prevPoll : pollList) {
            if (prevPoll.getId().equals(poll.getId())) {
                 pollToRemove = prevPoll;
            }
        }
        pollList.remove(pollToRemove);
        pollList.add(poll);
        (moderatorList.get(moderatorId)).setPolls(pollList);
    }

    public void addModerator(Moderator m){

        moderatorList.put(m.getId(),m);

    }

    public void addSampleModerators(){

    }

    public void updateModerator(Moderator m){

    }


}
