package ui;

import java.util.Iterator;
import java.util.List;

import dao.TeamDao;

import model.Team;

public class SelectTeamUi extends AbstractUi {

    private TeamDao teamDao;

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public void show() {
        // チーム一覧の表示
        showTeamList(this.teamDao.getTeamList());

    }

    protected void showTeamList(List teamList) {
        System.out.println("--------------------");
        System.out.println("『選手名鑑』「チーム一覧」");
        System.out.println("ID    名前");
        for (Iterator iter = teamList.iterator(); iter.hasNext();) {
            Team team = (Team) iter.next();
            // チームIDとチーム名の表示
            System.out.println(team.getId() + "  " + team.getName());
        }
    }
}
