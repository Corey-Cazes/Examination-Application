import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class HintTextField extends JTextField implements FocusListener
{

    public HintTextField ()
    {
        this("");
    }

    public HintTextField(final String hint)
    {
        setHint(" "+hint);
        super.addFocusListener(this);
    }

    public void setHint(String hint)
    {
        setUI(new HintTextFieldUI(hint, true));
        
    }


    public void focusGained(FocusEvent e)
    {
        if(this.getText().length() == 0)
        {
            super.setText("");
        }
    }

	@Override
	public void focusLost(FocusEvent e) {
		
		
	}
}