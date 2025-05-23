package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member){
        memberMap.put(member.getId(),member);
    }

    public void remove(String id){
        memberMap.remove(id);
    }

    public Member findById(String id){
        return memberMap.get(id);
    }

    public Member findByName(String name){
        Member member = null;
        for(String key : memberMap.keySet()){
            if(name.equals(memberMap.get(key).getName())){
                 member = memberMap.get(key);
            }
        }
        return member;
    }
}
