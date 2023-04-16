package logica.poo.ui;

import logica.poo.operaciones.OperacionesMiembros;

public class OpcionMenuListarMiembros extends OpcionMenu {

    @Override
    public void ejecutar() {
        OperacionesMiembros.listarMiembros();
    }

    @Override
    public String toString() {
        return "Listar miembros/clientes.";
    }
}
