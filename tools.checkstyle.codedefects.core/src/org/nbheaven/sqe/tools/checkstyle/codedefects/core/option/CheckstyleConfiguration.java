/* Copyright 2005,2006 Sven Reimers, Florian Vogler
 *
 * This file is part of the Software Quality Environment Project.
 *
 * The Software Quality Environment Project is free software:
 * you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation,
 * either version 2 of the License, or (at your option) any later version.
 *
 * The Software Quality Environment Project is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.nbheaven.sqe.tools.checkstyle.codedefects.core.option;

import javax.swing.JFileChooser;

/**
 *
 * @author Sven Reimers
 */
public class CheckstyleConfiguration extends javax.swing.JPanel {

    /** Creates new form CheckstyleConfiguration */
    public CheckstyleConfiguration() {
        initComponents();
    }

    public void setConfigFilePath(String path) {
        configFileTextField.setText(path);
    }

    public String getConfigFilePath() {
        return configFileTextField.getText();
    }

    public void setPropertiesFilePath(String path) {
        propertiesFileTextField.setText(path);
    }

    public String getPropertiesFilePath() {
        return propertiesFileTextField.getText();
    }

    public void setProperties(String propertiesText) {
        propertiesEditorPane.setText(propertiesText);
    }

    public String getProperties() {
        return propertiesEditorPane.getText();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configFileLabel = new javax.swing.JLabel();
        configFileTextField = new javax.swing.JTextField();
        browseConfigFileButton = new javax.swing.JButton();
        propertiesFileLabel = new javax.swing.JLabel();
        propertiesFileTextField = new javax.swing.JTextField();
        browsePropertiesFileButton = new javax.swing.JButton();
        propertiesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        propertiesEditorPane = new javax.swing.JEditorPane();

        configFileLabel.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.configFileLabel.text")); // NOI18N

        configFileTextField.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.configFileTextField.text")); // NOI18N

        browseConfigFileButton.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.browseConfigFileButton.text")); // NOI18N
        browseConfigFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseConfigFileButtonActionPerformed(evt);
            }
        });

        propertiesFileLabel.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.propertiesFileLabel.text")); // NOI18N

        propertiesFileTextField.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.propertiesFileTextField.text")); // NOI18N

        browsePropertiesFileButton.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.browsePropertiesFileButton.text")); // NOI18N
        browsePropertiesFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsePropertiesFileButtonActionPerformed(evt);
            }
        });

        propertiesLabel.setText(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.propertiesLabel.text")); // NOI18N

        propertiesEditorPane.setContentType(org.openide.util.NbBundle.getMessage(CheckstyleConfiguration.class, "CheckstyleConfiguration.propertiesEditorPane.contentType")); // NOI18N
        jScrollPane1.setViewportView(propertiesEditorPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configFileLabel)
                    .addComponent(propertiesFileLabel)
                    .addComponent(propertiesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(propertiesFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(configFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(browsePropertiesFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browseConfigFileButton, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseConfigFileButton)
                    .addComponent(configFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(configFileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propertiesFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsePropertiesFileButton)
                    .addComponent(propertiesFileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertiesLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void browseConfigFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseConfigFileButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser(getConfigFilePath());
        int returnCode = fileChooser.showDialog(this, "Select");
        if (JFileChooser.APPROVE_OPTION == returnCode) {
            setConfigFilePath(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_browseConfigFileButtonActionPerformed

    private void browsePropertiesFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsePropertiesFileButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser(getPropertiesFilePath());
        int returnCode = fileChooser.showDialog(this, "Select");
        if (JFileChooser.APPROVE_OPTION == returnCode) {
            setPropertiesFilePath(fileChooser.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_browsePropertiesFileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseConfigFileButton;
    private javax.swing.JButton browsePropertiesFileButton;
    private javax.swing.JLabel configFileLabel;
    private javax.swing.JTextField configFileTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane propertiesEditorPane;
    private javax.swing.JLabel propertiesFileLabel;
    private javax.swing.JTextField propertiesFileTextField;
    private javax.swing.JLabel propertiesLabel;
    // End of variables declaration//GEN-END:variables

}
