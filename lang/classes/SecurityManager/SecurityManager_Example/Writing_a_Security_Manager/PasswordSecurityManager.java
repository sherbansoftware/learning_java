package lang.classes.SecurityManager.SecurityManager_Example.Writing_a_Security_Manager;

// http://journals.ecs.soton.ac.uk/java/tutorial/networking/security/writingSMgr.html

import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;

public class PasswordSecurityManager extends SecurityManager {

    String password;

    public PasswordSecurityManager(String password) {
        super();
        this.password = password;
    }

    private boolean accessOK() {
        int c;
        DataInputStream dis = new DataInputStream(System.in);
        String response;

        System.out.println("What's the secret password?");
        try {
            response = dis.readLine();
            if (response.equals(password))
                return true;
            else
                return false;
        } catch (IOException e) {
            return false;
        }
    }

    //   Finally at the end of the PasswordSecurityManager class are the three overridden checkRead() methods and the two overridden checkWrite() methods:
    public void checkRead(FileDescriptor filedescriptor) {
        if (!accessOK())
            throw new SecurityException("Not a Chance!");
    }

    public void checkRead(String filename) {
        if (!accessOK())
            throw new SecurityException("No Way!");
    }

    public void checkRead(String filename, Object executionContext) {
        if (!accessOK())
            throw new SecurityException("Forget It!");
    }

    public void checkWrite(FileDescriptor filedescriptor) {
        if (!accessOK())
            throw new SecurityException("Not!");
    }

    public void checkWrite(String filename) {
        if (!accessOK())
            throw new SecurityException("Not Even!");
    }

}
