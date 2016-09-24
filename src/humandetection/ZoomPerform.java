package humandetection;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ZoomPerform extends JFrame implements ActionListener 
{

    JButton btZoomIn;
    JButton btZoomOut;
    JPanel panel;
    Zoom z; //declare zoom object 

    ZoomPerform() 
    {
        setTitle("Image zoom"); //set the window title
        z = new Zoom(); // instantiate zoom constructor and reference to z

        btZoomIn = new JButton("+"); 
        btZoomIn.setFont(new Font("Sans Serif", Font.BOLD, 30));//set font
        btZoomIn.setPreferredSize(new Dimension(60, 35)); //set button size
        btZoomIn.addActionListener(this); // add action listener to perform action

        btZoomOut = new JButton("-");
        btZoomOut.setFont(new Font("Sans Serif", Font.BOLD, 30));//set font
        btZoomOut.setPreferredSize(new Dimension(60, 35)); //set button size
        btZoomOut.addActionListener(this); // add action listener to perform action
        btZoomOut.setOpaque(false);

        add(z, BorderLayout.CENTER); //set the z to the border layout in center

        panel = new JPanel(); //initialized JPanel 
        panel.setLayout(new FlowLayout());// set the layout to flowlayout
        panel.add(btZoomIn); //add button
        panel.add(btZoomOut); //add button
        add(panel, BorderLayout.SOUTH); //add buttons to the border layout in south

        setVisible(true); //set the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btZoomIn)  //perform action when zoom in button click
        {
            z.zoomIn(); //call zoomIn method
            z.repaint();
        } else if (e.getSource() == btZoomOut)  //perform action when zoom out button click
        {
            z.zoomOut(); //call zoomOut method
            z.repaint();
        }
    }
}
