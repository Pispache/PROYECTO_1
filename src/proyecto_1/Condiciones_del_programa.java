package proyecto_1;

/**
 *
 * @author cesar
 */
public class Condiciones_del_programa {

    //Necesito explicarle a la computadora que operacion tiene
    //un valor mayor para ir ordenando en el arbol
    public static int Jerarquia_OP(char ope) {
        int jerarquia = 0;
        String op = String.valueOf(ope);
        if (op.equals(")")) {
            jerarquia = 5;
        }
        if (op.equals("^")) {
            jerarquia = 4;
        }
        if (op.equals("*") || op.equals("/")) {
            jerarquia = 3;
        }
        if (op.equals("+")) {
            jerarquia = 2;
        }

        if (op.equals("-")) {
            jerarquia = 1;
        }

        if (op.equals("xd")) {
            jerarquia = 1;
        }
        return jerarquia;
    }
}
