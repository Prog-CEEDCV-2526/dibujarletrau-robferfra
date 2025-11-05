public class DibujarLetraU {
    public static void main(String[] args) {

        int filas = 7;
        int columnas = 5;

        // Paso 1: Crear la matriz de caracteres

        char[][] matriz = new char[filas][columnas];

        // Paso 2: Rellenar la matriz con espacios

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Paso 3: Dibujar los lados verticales de la letra U

        for (int i = 0; i < filas; i++) {
            matriz[i][0] = '*';
        }
        for (int i = 0; i < filas; i++) {
            matriz[i][columnas - 1] = '*';
        }

        // Paso 4: Dibujar la base de la U (última fila)

        for (int i = 0; i < columnas; i++) {
            matriz[filas - 1][i] = '*';
        }

        // Paso 5: Mostrar la matriz en consola

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
