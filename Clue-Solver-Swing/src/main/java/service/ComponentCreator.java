package service;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import model.CardButton;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class ComponentCreator {

	private int comboBoxWidth = 200;
	private int comboBoxHeight = 25;
	private int eliminateWidth = 150;
	private int eliminateHeight = 150;
	private int eliminateCardWidth = 150;
	private int eliminateCardHeight = 25;
	private int eliminateTripleWidth = 150;
	private int eliminateTripleHeight = 25;
	private int regularButtonWidth = 100;
	private int regularButtonHeight = 25;

	private ComponentManipulator componentManipulator = new ComponentManipulator();

	public ComponentCreator() {
	}

	public JPanel getBorderPanel() {
		JPanel panel = new JPanel();
		BorderLayout layout = new BorderLayout();
		panel.setLayout(layout);

		return panel;
	}

	public CardButton[] getButtons(String buttonType, final JFrame parent) {
		CardButton[] buttons = null;
		if (buttonType.equals("rooms")) {
			buttons = new CardButton[RoomEnum.values().length];
			int i = 0;
			for (RoomEnum room : RoomEnum.values()) {
				buttons[i] = new CardButton(room.getRoom(), parent);
				buttons[i].setPreferredSize(new Dimension(eliminateCardWidth, eliminateCardHeight));
				i++;
			}
		} else if (buttonType.equals("suspects")) {
			buttons = new CardButton[SuspectEnum.values().length];
			int i = 0;
			for (SuspectEnum suspect : SuspectEnum.values()) {
				buttons[i] = new CardButton(suspect.getSuspect(), parent);
				i++;
			}
		} else if (buttonType.equals("weapons")) {
			buttons = new CardButton[WeaponEnum.values().length];
			int i = 0;
			for (WeaponEnum weapon : WeaponEnum.values()) {
				buttons[i] = new CardButton(weapon.getWeapon(), parent);
				i++;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Card Type!");
		}

		return buttons;
	}

	public JComboBox getComboBox() {
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(comboBoxWidth, comboBoxHeight));

		return comboBox;
	}

	public JButton getEliminateButton(String buttonTitle) {
		JButton button = new JButton(buttonTitle);
		button.setPreferredSize(new Dimension(eliminateWidth, eliminateHeight));

		return button;
	}

	public JPanel getFlowPanel() {
		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);

		return panel;
	}

	public Iterable<JRadioButton> getRadioButtons(String radioButtonType) {
		Iterable<String> buttonTitles = null;
		Collection<JRadioButton> buttons = Lists.newArrayList();

		if (radioButtonType.equals("rooms")) {
			buttonTitles = RoomEnum.getStringValues();
		} else if (radioButtonType.equals("suspects")) {
			buttonTitles = SuspectEnum.getStringValues();
		} else if (radioButtonType.equals("weapons")) {
			buttonTitles = WeaponEnum.getStringValues();
		}

		Preconditions.checkNotNull(buttonTitles);

		for (String buttonTitle : buttonTitles) {
			JRadioButton button = new JRadioButton(componentManipulator.uppercaseFirstLetters(buttonTitle));
			button.setPreferredSize(new Dimension(eliminateTripleWidth, eliminateTripleHeight));
			buttons.add(button);
		}

		return buttons;
	}

	public JButton getRegularButton(String buttonTitle, final JFrame parent) {
		JButton button = new JButton(buttonTitle);
		button.setPreferredSize(new Dimension(regularButtonWidth, regularButtonHeight));
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				parent.dispose();
			}
		});
		return button;
	}

	public JPanel getTitledFlowPanel(String panelTitle) {
		JPanel panel = new JPanel();
		FlowLayout layout = new FlowLayout();
		panel.setLayout(layout);
		panel.setBorder(BorderFactory.createTitledBorder(panelTitle));

		return panel;
	}
}