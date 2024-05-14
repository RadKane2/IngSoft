package MySQLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    // JDBC URL, usuario y contraseña de tu base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3307/residenciaestundiantil";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection getConnection() throws SQLException {
        // Carga el controlador JDBC de MySQL
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        // Establece la conexión con la base de datos
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            // Obtiene una conexión a la base de datos
            Connection connection = MySQLConnection.getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos MySQL!");
                // Puedes continuar ejecutando consultas o realizando otras operaciones aquí
                connection.close(); // No olvides cerrar la conexión cuando hayas terminado
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
