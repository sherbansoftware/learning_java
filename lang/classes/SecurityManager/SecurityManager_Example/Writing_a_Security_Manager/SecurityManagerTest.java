package lang.classes.SecurityManager.SecurityManager_Example.Writing_a_Security_Manager;

/*
 * Copyright (c) 1995-1997 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
import java.io.*;

class SecurityManagerTest {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new PasswordSecurityManager("Booga"));
        } catch (SecurityException se) {
            System.err.println("SecurityManager already set!");
        }

        try {
            DataInputStream fis = new DataInputStream(new FileInputStream("inputtext.txt"));
            DataOutputStream fos = new DataOutputStream(new FileOutputStream("outputtext.txt"));
            String inputString;
            while ((inputString = fis.readLine()) != null) {
                fos.writeBytes(inputString);
                fos.writeByte('\n');
            }
            fis.close();
            fos.close();
        } catch (IOException ioe) {
            System.err.println("I/O failed for SecurityManagerTest.");
        }
    }
}
