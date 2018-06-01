import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class HintTextField extends JTextField implements FocusListener
{

    private String hint;

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
        this.hint = hint;
        setUI(new HintTextFieldUI(hint, true));
        //setText(this.hint);
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
		// TODO Auto-generated method stub
		
	}
}