package ui;



public abstract class AbstractUiTemplate extends AbstractUi {

    public void show() {
        // ���܂�
        execute();
    }
   
    abstract protected void execute();

}
