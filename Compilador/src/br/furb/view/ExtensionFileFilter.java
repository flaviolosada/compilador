/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.furb.view;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Flávio e Carol
 */
public class ExtensionFileFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (!f.isDirectory()) {
            String extensao = f.getAbsolutePath().substring(f.getAbsolutePath().lastIndexOf("."), f.getAbsolutePath().length());
            return  ".txt".equalsIgnoreCase(extensao);
        }
        return true;
    }

    @Override
    public String getDescription() {
        return "Code (.txt)";
    }
    
}
