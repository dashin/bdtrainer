package hello;

import java.io.InputStream;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author dashin
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    
    private boolean direction = true;
    private int currentPosition = 0;
    private Dictionary dictionary;
    private DictionaryLoader dictionaryLoader = new ResourceDictionaryLoader();
    private String currentText;
    private String currentFile;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command backCommand;
    private Command itemCommand;
    private Command okCommand;
    private Command itemCommand1;
    private Command okCommand1;
    private Form form;
    private StringItem stringItem;
    private List list;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|23-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|23-preAction
                // write pre-action user code here
                next();
//GEN-LINE:|7-commandAction|2|23-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|19-postAction
                // write post-action user code here
            } else if (command == itemCommand1) {//GEN-LINE:|7-commandAction|5|33-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|6|33-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|7|27-preAction
                // write pre-action user code here
                translate();
//GEN-LINE:|7-commandAction|8|27-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|30-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|9|30-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|10|30-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|11|36-preAction
                // write pre-action user code here
                loadCurrentFile(getList().getString(getList().getSelectedIndex() + 1 - 1));
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|12|36-postAction
                refresh();
            }//GEN-BEGIN:|7-commandAction|13|7-postCommandAction
        }//GEN-END:|7-commandAction|13|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|14|
    //</editor-fold>//GEN-END:|7-commandAction|14|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Trainer", new Item[] { getStringItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getBackCommand());
            form.addCommand(getOkCommand());
            form.addCommand(getItemCommand1());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            stringItem = new StringItem("", "", Item.PLAIN);//GEN-LINE:|16-getter|1|16-postInit
            stringItem.setText(currentText);
        }//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|16-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            backCommand = new Command("Next", Command.BACK, 0);//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            itemCommand = new Command("Item", Command.ITEM, 0);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|24-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initiliazed instance of itemCommand1 component.
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|32-getter|0|32-preInit
            // write pre-init user code here
            itemCommand1 = new Command("Dictionaries", Command.ITEM, 0);//GEN-LINE:|32-getter|1|32-postInit
            // write post-init user code here
        }//GEN-BEGIN:|32-getter|2|
        return itemCommand1;
    }
    //</editor-fold>//GEN-END:|32-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|35-getter|0|35-preInit
    /**
     * Returns an initiliazed instance of okCommand1 component.
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|35-getter|0|35-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.ITEM, 9);//GEN-LINE:|35-getter|1|35-postInit
            // write post-init user code here
        }//GEN-BEGIN:|35-getter|2|
        return okCommand1;
    }
    //</editor-fold>//GEN-END:|35-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of list component.
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            list = new List("Dictionaries", Choice.IMPLICIT);//GEN-BEGIN:|28-getter|1|28-postInit
            list.addCommand(getOkCommand1());
            list.setCommandListener(this);//GEN-END:|28-getter|1|28-postInit
            // write post-init user code here
            
            final InputStream is = getClass().getResourceAsStream("/list");
            
            String listFiles = "Nothing found";

            try {
                byte[] listFilesBytes = new byte[is.available()];        
                is.read(listFilesBytes);
                listFiles = new String(listFilesBytes, "UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            int endOfLine = 0;
            while ((endOfLine = listFiles.indexOf("\n")) != -1) {
                String line = listFiles.substring(0, endOfLine);
                listFiles = listFiles.substring(endOfLine + 1);
                if (!"list".equals(line)) {
                    list.append(line, null);
                }
            }
            
        }//GEN-BEGIN:|28-getter|2|
        return list;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|28-action|0|28-preAction
    /**
     * Performs an action assigned to the selected list element in the list component.
     */
    public void listAction() {//GEN-END:|28-action|0|28-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-LINE:|28-action|1|28-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|28-action|2|
    //</editor-fold>//GEN-END:|28-action|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
    private void next() {
        if (currentPosition == dictionary.length() - 1) {
            currentPosition = 0;
        } else {
            currentPosition++;
        }
        currentText = dictionary.get(currentPosition).getWordOrTranslation(direction);
        refresh();
    }
    
    private void translate() {
        currentText = dictionary.get(currentPosition).getWordOrTranslation(!direction);
        refresh();
    }
    
    private void refresh() {
        ((StringItem) getForm().get(0)).setText(currentText);
    }
    
    private void loadCurrentFile(String currentFile) {
        this.currentFile = currentFile;
        dictionary = dictionaryLoader.loadDictionary(currentFile);
        currentPosition = 0;
        currentText = dictionary.get(currentPosition).getWordOrTranslation(true);
    }

}
