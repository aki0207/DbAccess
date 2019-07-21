package ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MenuUi extends AbstractUiTemplate {

    private SelectTeamUi selectTeamUi;

    public void setSelectTeamUi(SelectTeamUi selectTeamUi) {
        this.selectTeamUi = selectTeamUi;
    }


    protected void execute() {
    	this.selectTeamUi.show();
    }

    public static void main(String[] args) {
        // Springê›íËÉtÉ@ÉCÉãÇÃì«Ç›çûÇ›
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MenuUi menuUi = (MenuUi) context.getBean("menuUi");
        
            menuUi.show();
        
    }
}
