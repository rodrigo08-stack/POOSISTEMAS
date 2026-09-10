package pe.edu.upeu.sysventas.service.impl;

import pe.edu.upeu.sysventas.model.UnidMedida;
import pe.edu.upeu.sysventas.repository.ICrudGenericoRepository;
import pe.edu.upeu.sysventas.repository.UnidadMedidaRepository;
import pe.edu.upeu.sysventas.service.IUnidadMedidaService;

public class UnidadMedidaService extends CrudGenericoServiceImp<UnidMedida, Long> implements IUnidadMedidaService{
    private final UnidadMedidaRepository unidMedida;

    public UnidadMedidaService(UnidadMedidaRepository unidMedida) {
        this.unidMedida = unidMedida;
    }


    @Override
    protected ICrudGenericoRepository<UnidMedida, Long> getRepo() {
        return unidMedida;
    }
}