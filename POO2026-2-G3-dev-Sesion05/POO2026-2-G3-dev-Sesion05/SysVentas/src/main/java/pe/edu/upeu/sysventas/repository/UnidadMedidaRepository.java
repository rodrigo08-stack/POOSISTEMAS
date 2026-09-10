package pe.edu.upeu.sysventas.repository;

import pe.edu.upeu.sysventas.model.UnidMedida;

public class UnidadMedidaRepository extends AbstractLpaRepository<UnidMedida, Long>{
    private long sequence=1;
    @Override
    protected Long getId(UnidMedida entity) {
        return entity.getIdUnidad();
    }

    @Override
    protected void setid(UnidMedida entity, Long id) {
        entity.setIdUnidad(id);

    }

    @Override
    protected Long generateId() {
        return sequence++;
    }
}
