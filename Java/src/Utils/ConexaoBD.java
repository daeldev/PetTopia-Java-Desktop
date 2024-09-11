
package Utils;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno.Tarde
 */
public class ConexaoBD {
    public Connection ConectaBD(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/idealfashion?user=root&password=";
            conn = (Connection) DriverManager.getConnection(url);
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "ConexaotesteDAO" + erro.getMessage());
        }
        return conn;
    }
}