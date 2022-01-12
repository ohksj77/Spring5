package spring;

import java.util.Collection;

public class MemberListPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;
    public MemberListPrinter(MemberDao memberdao, MemberPrinter printer){
        this.memberDao = memberdao;
        this.printer = printer;
    }
    public void printAll(){
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m->printer.print(m));
    }
}
