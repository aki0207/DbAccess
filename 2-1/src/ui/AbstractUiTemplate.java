package ui;



public abstract class AbstractUiTemplate extends AbstractUi {

    public void show() {
        // ‚©‚Ü‚·
        execute();
    }
   
    abstract protected void execute();

}
