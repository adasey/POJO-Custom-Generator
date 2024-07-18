package fr.jukien.intellij.plugins.ui;

import javax.swing.*;

/**
 * Created on 24/04/2019
 *
 * @author JDI
 * @version 2.6.0
 * @since 1.0.0
 */
public class POJOGeneratorPanel {
    private JPanel panel;
    private JCheckBox capitalizeCheckBox;
    private JCheckBox schemaAttributeCheckBox;
    private JCheckBox generatedValueAnnotationsCheckBox;
    private JCheckBox manyToOneAndJoinColumnAnnotationsCheckBox;
    private JCheckBox generateCompositePrimaryKeyCheckBox;
    private JRadioButton idClassAnnotationRadioButton;
    private JRadioButton embeddedIdAnnotationRadioButton;
    private JLabel prefixCompositePrimaryKeyLabel;
    private JTextField prefixCompositePrimaryKeyTextField;
    private JLabel suffixCompositePrimaryKeyLabel;
    private JTextField suffixCompositePrimaryKeyTextField;
    private JTextField prefixEntityTextField;
    private JTextField suffixEntityTextField;
    private JTextField prefixDTOTextField;
    private JTextField suffixDTOTextField;
    private JCheckBox alwaysShowDifferencesBetweenFilesCheckBox;
    private JTextArea headerEntityTextArea;
    private JTextArea headerDTOTextArea;

    public POJOGeneratorPanel(POJOGeneratorSettings pojoGeneratorSettings) {
        // Initialise l'interface graphique avec les settings qui ont été enregistrés avant
        capitalizeCheckBox.setSelected(pojoGeneratorSettings.getCapitalize());
        schemaAttributeCheckBox.setSelected(pojoGeneratorSettings.getWithSchemaAttribute());
        generatedValueAnnotationsCheckBox.setSelected(pojoGeneratorSettings.getAutoGenerated());
        manyToOneAndJoinColumnAnnotationsCheckBox.setSelected(pojoGeneratorSettings.getWithRelationshipAnnotations());
        generateCompositePrimaryKeyCheckBox.setSelected(pojoGeneratorSettings.getGenerateCompositePrimaryKey());
        idClassAnnotationRadioButton.setSelected(pojoGeneratorSettings.getGenerateCompositePrimaryKeyWithIdClassAnnotation());
        embeddedIdAnnotationRadioButton.setSelected(pojoGeneratorSettings.getGenerateCompositePrimaryKeyWithEmbeddedIdAnnotation());
        prefixCompositePrimaryKeyTextField.setText(pojoGeneratorSettings.getPrefixCompositePrimaryKey());
        suffixCompositePrimaryKeyTextField.setText(pojoGeneratorSettings.getSuffixCompositePrimaryKey());
        prefixEntityTextField.setText(pojoGeneratorSettings.getPrefixEntity());
        suffixEntityTextField.setText(pojoGeneratorSettings.getSuffixEntity());
        prefixDTOTextField.setText(pojoGeneratorSettings.getPrefixDto());
        suffixDTOTextField.setText(pojoGeneratorSettings.getSuffixDto());
        alwaysShowDifferencesBetweenFilesCheckBox.setSelected(pojoGeneratorSettings.getAlwaysShowDifferencesBetweenFiles());
        headerEntityTextArea.setText(pojoGeneratorSettings.getHeaderEntity());
        headerDTOTextArea.setText(pojoGeneratorSettings.getHeaderDTO());
    }

    public JPanel getPanel() {
        return panel;
    }

    public JCheckBox getCapitalizeCheckBox() {
        return capitalizeCheckBox;
    }

    public JCheckBox getSchemaAttributeCheckBox() {
        return schemaAttributeCheckBox;
    }

    public JCheckBox getGeneratedValueAnnotationsCheckBox() {
        return generatedValueAnnotationsCheckBox;
    }

    public JCheckBox getManyToOneAndJoinColumnAnnotationsCheckBox() {
        return manyToOneAndJoinColumnAnnotationsCheckBox;
    }

    public JCheckBox getGenerateCompositePrimaryKeyCheckBox() {
        return generateCompositePrimaryKeyCheckBox;
    }

    public JRadioButton getIdClassAnnotationRadioButton() {
        return idClassAnnotationRadioButton;
    }

    public JRadioButton getEmbeddedIdAnnotationRadioButton() {
        return embeddedIdAnnotationRadioButton;
    }

    public JLabel getPrefixCompositePrimaryKeyLabel() {
        return prefixCompositePrimaryKeyLabel;
    }

    public JTextField getPrefixCompositePrimaryKeyTextField() {
        return prefixCompositePrimaryKeyTextField;
    }

    public JLabel getSuffixCompositePrimaryKeyLabel() {
        return suffixCompositePrimaryKeyLabel;
    }

    public JTextField getSuffixCompositePrimaryKeyTextField() {
        return suffixCompositePrimaryKeyTextField;
    }

    public JTextField getPrefixEntityTextField() {
        return prefixEntityTextField;
    }

    public JTextField getSuffixEntityTextField() {
        return suffixEntityTextField;
    }

    public JTextField getPrefixDTOTextField() {
        return prefixDTOTextField;
    }

    public JTextField getSuffixDTOTextField() {
        return suffixDTOTextField;
    }

    public JCheckBox getAlwaysShowDifferencesBetweenFilesCheckBox() {
        return alwaysShowDifferencesBetweenFilesCheckBox;
    }

    public JTextArea getHeaderEntityTextArea() {
        return headerEntityTextArea;
    }

    public JTextArea getHeaderDTOTextArea() {
        return headerDTOTextArea;
    }
}
