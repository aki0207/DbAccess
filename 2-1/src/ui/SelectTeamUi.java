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
        // �`�[���ꗗ�̕\��
        showTeamList(this.teamDao.getTeamList());

    }

    protected void showTeamList(List teamList) {
        System.out.println("--------------------");
        System.out.println("�w�I�薼�Ӂx�u�`�[���ꗗ�v");
        System.out.println("ID    ���O");
        for (Iterator iter = teamList.iterator(); iter.hasNext();) {
            Team team = (Team) iter.next();
            // �`�[��ID�ƃ`�[�����̕\��
            System.out.println(team.getId() + "  " + team.getName());
        }
    }
}
